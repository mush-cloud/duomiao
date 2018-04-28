package com.duomiao.control;

import com.duomiao.entity.PositionCategory;
import com.duomiao.entity.PublishJob;
import com.duomiao.service.PositionCategoryService;
import com.duomiao.service.PublishJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/public")
public class IndexControl {
	@Autowired
	private PositionCategoryService positionCategoryService;
	@Autowired
	private PublishJobService publishJobService;
    @RequestMapping("/index")
	public String accessIndexPage(HttpServletRequest request) {
    	//获取一级类别
		List<PositionCategory> baseKinds = positionCategoryService.selectBaseKinds();
		int rows = 0;
		if(baseKinds!=null){
			int count = baseKinds.size();
			rows = (count+3)/4;
		}
		   List list = new ArrayList();
			for (PositionCategory positionCategory : baseKinds) {
				List<PositionCategory> childKinds = positionCategoryService.selectByFatherId(positionCategory.getId());
				if (childKinds != null && childKinds.size() > 0) {
					childKinds.add(0, positionCategory);
				} else {
					childKinds = new ArrayList<>();
					childKinds.add(positionCategory);
				}
				list.add(childKinds);
			}
			List<PublishJob> hotJobs = publishJobService.selectHotPubJob();
			List<PublishJob> newJobs = publishJobService.selectNewPubJob();
		request.setAttribute("rows",rows);
		request.setAttribute("allPosCate",list);
		request.setAttribute("hotJobs",hotJobs);
		request.setAttribute("newJobs",newJobs);

		return "index";
	}

	@RequestMapping("/mainSearch")
	public String accessMainSearchPage(@RequestParam(required = false) String jobName,@RequestParam(required = false) String id,@RequestParam(required = false) String childId,HttpServletRequest request) {
    	List<PositionCategory> positionCategoryList = positionCategoryService.selectByFatherId(id);
    	List arrId= new ArrayList();
		request.setAttribute("pcId",childId);
    	if(positionCategoryList!=null && positionCategoryList.size()>0){
    		for(PositionCategory positionCategory:positionCategoryList){
    			arrId.add(positionCategory.getId());
			}
			request.setAttribute("arrId",arrId);
		}else{
			request.setAttribute("arrId",null);
		}
    	request.setAttribute("jobName",jobName);
		return "mainsearch";
	}

}
