package com.duomiao.control;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.duomiao.entity.InternInfo;
import com.duomiao.service.InternInfoService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.Constant;
import com.duomiao.util.DateHelper;
import com.duomiao.util.UUIDBuilder;

@Controller
@RequestMapping("/intern")
public class InternInfoControl {
	private AjaxResult ajaxResult = new AjaxResult();;
	@Autowired
	private InternInfoService internInfoService;
	
    @RequestMapping("/enLoginAndRegister")
	public String enLoginAndRegisterPage() {
		return "interncenter/login_register";
	}
	
    @RequestMapping("/doLogin")
    @ResponseBody
    public  AjaxResult doLogin(@RequestParam Map<String,Object> map,HttpSession session) {
       List<InternInfo> internInfos = internInfoService.getInternInfoList(map);
       if(internInfos != null && internInfos.size() > 0) {
    	   System.err.println("ok");
    	   ajaxResult.setSuccess(true);
    	   session.setAttribute(Constant.SESSION_INTERN_INFO, internInfos.get(0));
    	   session.removeValue(Constant.SESSION_HR_INFO);
		   session.removeValue(Constant.SESSION_ADMIN_INFO);
       }else {
    	   ajaxResult.setSuccess(false);
       }
    	return ajaxResult;
    }
    
    @RequestMapping("/doLoginOut")
    public  String doLoginOut(HttpSession session) {
    	   session.setAttribute(Constant.SESSION_INTERN_INFO, null);
    	   return "redirect:/public/index";
    }
    
    @RequestMapping("/doCheckSameName")
    @ResponseBody
    public AjaxResult doCheckSameName(HttpServletRequest request) {
    	String name = request.getParameter("name");
    	ajaxResult.setSuccess(false);
    	int count = internInfoService.validateSameName(name);
    	if(count > 0) {
    		ajaxResult.setSuccess(true);//名字已存在
    	}
    	return ajaxResult;
    }
    
    @RequestMapping("/doRegister")
    @ResponseBody
    public AjaxResult doRegister(@ModelAttribute InternInfo internInfo) {
    	internInfo.setRegisterTime(DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
    	internInfo.setId(UUIDBuilder.createUUID());
    	internInfo.setDb("0");
    	internInfo.setFlag("I");//唯一标识
    	internInfo.setState("0");//默认未激活
    	internInfo.setImgUrl("/imgs/index_header_bottom/default.png");//图像默认
        int result = internInfoService.registerInternInfo(internInfo);
        if(result>0) {
        	ajaxResult.setSuccess(true);
        }else {
        	ajaxResult.setSuccess(false);
        }
    	return ajaxResult;
    }
    
    //基本信息修改,密码，真实姓名，图像
    @RequestMapping("/adminlte/doEditMainInfo")
    @ResponseBody
    public AjaxResult alertMainInfoByOwn(@ModelAttribute InternInfo internInfo,HttpSession session){
    	if(internInfo.getImgUrl().equals("")) {
    		internInfo.setImgUrl("/imgs/index_header_bottom/default.png");
    	}
    	internInfoService.updateInternInfoForOwn(internInfo);
    	//更新session
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", internInfo.getId());
    	 List<InternInfo> internInfos = internInfoService.getInternInfoList(map);
    	 session.setAttribute(Constant.SESSION_INTERN_INFO, internInfos.get(0));
    	return ajaxResult;
    }
    
    //访问个人中心
    @RequestMapping("/adminlte/enIndex")
    public String enAdminLteIndex() {
    	return "interncenter/adminlte/index";
    }
    
    //访问基本信息页面
    @RequestMapping("/adminlte/enBasicInfo")
    public String enBasicInfo() {
    	return "interncenter/adminlte/basicinfo";
    }

	//访问简历管理页面
	@RequestMapping("/adminlte/enResumeInfo")
	public String enResumeInfo() {
		return "interncenter/adminlte/resumeinfo";
	}

	//访问我的收藏页面
	@RequestMapping("/adminlte/enMyCollect")
	public String enMyCollect() {
		return "interncenter/adminlte/mycollect";
	}

    //上传图片
    @RequestMapping("/adminlte/doUpImg")
    @ResponseBody
    public AjaxResult upImg(@RequestParam(value = "file", required = false)MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {
    	//物理路径
    	String path = request.getSession().getServletContext().getRealPath("/imgs/imgs_server");
    	Map<String,Object> map = new HashMap<String,Object>();
    	String fileName = file.getOriginalFilename();
    	File dir = new File(path,fileName);
    	if(!dir.exists()) {
    		dir.mkdirs();
    	}
    	file.transferTo(dir);
    	String enPath = "/imgs/imgs_server/"+ file.getOriginalFilename();
    	map.put("imgPath", enPath);
    	ajaxResult.setMessage(map);
    	ajaxResult.setSuccess(true);
    	return ajaxResult;
    }
}
