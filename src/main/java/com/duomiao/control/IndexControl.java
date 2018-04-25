package com.duomiao.control;

import com.duomiao.entity.PositionCategory;
import com.duomiao.service.PositionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/public")
public class IndexControl {
	@Autowired
	private PositionCategoryService positionCategoryService;
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
		request.setAttribute("rows",rows);
		request.setAttribute("allPosCate",list);

		return "index";
	}
}
