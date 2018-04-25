package com.duomiao.control;

import com.duomiao.entity.HrInfo;
import com.duomiao.entity.PositionCategory;
import com.duomiao.service.HrInfoService;
import com.duomiao.service.PositionCategoryService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.Constant;
import com.duomiao.util.DateHelper;
import com.duomiao.util.UUIDBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hr")
public class HrInfoControl {
	private AjaxResult ajaxResult = new AjaxResult();;
	@Autowired
	private HrInfoService hrInfoService;
	@Autowired
	private PositionCategoryService positionCategoryService;
    @RequestMapping("/enLoginAndRegister")
	public String enLoginAndRegisterPage() {
		return "hrcenter/login_register";
	}
	
    @RequestMapping("/doLogin")
    @ResponseBody
    public  AjaxResult doLogin(@ModelAttribute HrInfo hrInfo,HttpSession session) {
       HrInfo hrInfo2 = hrInfoService.selectMyHrInfo(hrInfo);
       if(hrInfo2 != null) {
    	   System.err.println("ok");
    	   ajaxResult.setSuccess(true);
    	   session.setAttribute(Constant.SESSION_HR_INFO, hrInfo2);
    	   session.removeValue(Constant.SESSION_INTERN_INFO);
		   session.removeValue(Constant.SESSION_ADMIN_INFO);
       }else {
    	   ajaxResult.setSuccess(false);
       }
    	return ajaxResult;
    }
    
    @RequestMapping("/doLoginOut")
    public  String doLoginOut(HttpSession session) {
    	   session.setAttribute(Constant.SESSION_HR_INFO, null);
    	   return "redirect:/public/index";
    }
    
    @RequestMapping("/doCheckSameName")
    @ResponseBody
    public AjaxResult doCheckSameName(HttpServletRequest request) {
    	String name = request.getParameter("hrName");
    	ajaxResult.setSuccess(false);
    	int count = hrInfoService.validateSameName(name);
    	if(count > 0) {
    		ajaxResult.setSuccess(true);//名字已存在
    	}
    	return ajaxResult;
    }

    @RequestMapping("/doRegister")
    @ResponseBody
    public AjaxResult doRegister(@ModelAttribute HrInfo hrInfo) {
    	hrInfo.setRegtime(DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
    	hrInfo.setId(UUIDBuilder.createUUID());
    	hrInfo.setFlag("H");//唯一标识
    	hrInfo.setImgUrl("/imgs/imgs_server/hr/hrdefault.jpg");//图像默认
        int result = hrInfoService.insertHrInfo(hrInfo);
        if(result>0) {
        	ajaxResult.setSuccess(true);
        }else {
        	ajaxResult.setSuccess(false);
        }
    	return ajaxResult;
    }
    
    //基本信息修改,密码，联系方式，图像
    @RequestMapping("/adminlte/doEditMainInfo")
    @ResponseBody
    public AjaxResult alertMainInfoByOwn(@RequestParam Map map,HttpSession session){
    	hrInfoService.updateMyHrInfo(map);
    	//更新session
    	Map<String,Object> map2 = new HashMap<String,Object>();
    	map2.put("id", map.get("id"));
    	 List<HrInfo> hrInfos = hrInfoService.selectHrInfoList(map2);
    	 session.setAttribute(Constant.SESSION_HR_INFO, hrInfos.get(0));
    	 ajaxResult.setSuccess(true);
    	return ajaxResult;
    }
    
    //访问HR中心
    @RequestMapping("/adminlte/enIndex")
    public String enAdminLteIndex() {
    	return "hrcenter/adminlte/index";
    }
    
    //访问基本信息页面
    @RequestMapping("/adminlte/enBasicInfo")
    public String enBasicInfo() {
    	return "hrcenter/adminlte/basicinfo";
    }

	//访问企业登记页面
	@RequestMapping("/adminlte/enEnterpriseInfo")
	public String enRegEnt() {
		return "hrcenter/adminlte/regent";
	}
	//访问简历管理页面
	@RequestMapping("/adminlte/enResumeInfo")
	public String enResumeInfo() {
		return "hrcenter/adminlte/resumeinfo";
	}

	//访问发布职位页面
	@RequestMapping("/adminlte/enPublishJob")
	public String enPublishJob(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws IOException {
    	HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
		String entid = "";
    	if(hrInfo!=null){
			entid = hrInfo.getEntid();
		}
    	List<PositionCategory> positionCategoryList =   positionCategoryService.selectAllChild();
		request.setAttribute("entid",entid);
		request.setAttribute("posCateList",positionCategoryList);
    	return "hrcenter/adminlte/publishjob";
	}

	//访问职位管理页面
	@RequestMapping("/adminlte/enManagePublishJob")
	public String enMyCollect() {
		return "hrcenter/adminlte/managejob";
	}

    //上传图片
    @RequestMapping("/adminlte/doUpImg")
    @ResponseBody
    public AjaxResult upImg(@RequestParam(value = "file", required = false)MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {
    	//物理路径
    	String path = request.getSession().getServletContext().getRealPath("/imgs/imgs_server/hr");
    	Map<String,Object> map = new HashMap<String,Object>();
    	String fileName = file.getOriginalFilename();
    	File dir = new File(path,fileName);
    	if(!dir.exists()) {
    		dir.mkdirs();
    	}
    	file.transferTo(dir);
    	String enPath = "/imgs/imgs_server/hr"+ file.getOriginalFilename();
    	map.put("imgPath", enPath);
    	ajaxResult.setMessage(map);
    	ajaxResult.setSuccess(true);
    	return ajaxResult;
    }
}
