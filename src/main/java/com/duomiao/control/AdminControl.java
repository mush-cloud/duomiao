package com.duomiao.control;

import com.duomiao.entity.AdminInfo;
import com.duomiao.entity.HrInfo;
import com.duomiao.entity.InternInfo;
import com.duomiao.service.AdminInfoService;
import com.duomiao.service.EnterpriseInfoService;
import com.duomiao.service.HrInfoService;
import com.duomiao.service.InternInfoService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.BootsTable;
import com.duomiao.util.Constant;
import com.duomiao.util.UUIDBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminControl {
	private AjaxResult ajaxResult = new AjaxResult();;
	@Autowired
	private AdminInfoService adminInfoService;
	@Autowired
	private HrInfoService hrInfoService;
	@Autowired
	private EnterpriseInfoService enterpriseInfoService;
	@Autowired
	private InternInfoService internInfoService;
	
    @RequestMapping("/enLogin")
	public String enLoginPage() {
		return "admincenter/login_register";
	}
	
    @RequestMapping("/doLogin")
    @ResponseBody
    public  AjaxResult doLogin(@ModelAttribute AdminInfo admin,HttpSession session) {
      AdminInfo adminInfo = adminInfoService.selectLoginAdmin(admin);

       if(adminInfo != null) {
    	   System.err.println("ok");
    	   ajaxResult.setSuccess(true);
    	   session.setAttribute(Constant.SESSION_ADMIN_INFO, adminInfo);
    	   session.removeValue(Constant.SESSION_HR_INFO);
		   session.removeValue(Constant.SESSION_INTERN_INFO);
       }else {
    	   ajaxResult.setSuccess(false);
       }
    	return ajaxResult;
    }
    
    @RequestMapping("/doLoginOut")
    public  String doLoginOut(HttpSession session) {
    	   session.setAttribute(Constant.SESSION_ADMIN_INFO, null);
    	   return "redirect:/public/index";
    }
    
    @RequestMapping("/doCheckSameName")
    @ResponseBody
    public AjaxResult doCheckSameName(@RequestParam String adminName) {
    	ajaxResult.setSuccess(false);
    	AdminInfo adminInfo = adminInfoService.selectRepeatAdmin(adminName);
    	if(adminInfo!=null) {
    		ajaxResult.setSuccess(true);//名字已存在
    	}
    	return ajaxResult;
    }

	@RequestMapping("/getAdminList")
	@ResponseBody
	public BootsTable getAdminList(@RequestBody Map map) {
		int currentPage = (int)map.get("pageNumber");
		int length = (int)map.get("pageSize");
		int start = (currentPage-1)*length;
		map.put("start",start);
		map.put("length",length);
	BootsTable bootsTable = new BootsTable();
		List<AdminInfo> adminInfoList = adminInfoService.selectAdmins(map);
		bootsTable.setRows(adminInfoList);
		bootsTable.setTotal(adminInfoList.size());
		return bootsTable;
	}


    
    @RequestMapping("/doAddAdmin")
    @ResponseBody
    public AjaxResult doAddAdmin(@ModelAttribute AdminInfo adminInfo) {
		ajaxResult.setSuccess(false);
		adminInfo.setId(UUIDBuilder.createUUID());
		int flag = adminInfoService.insertAdmin(adminInfo) ;
		if(flag>0){ajaxResult.setSuccess(true);}
    	return ajaxResult;
    }

	@RequestMapping("/doDelAdmin")
	@ResponseBody
	public AjaxResult doDelAdmin(@RequestParam String id) {
		ajaxResult.setSuccess(false);
		int flag = adminInfoService.deleteByPrimaryKey(id);
		if(flag>0){ajaxResult.setSuccess(true);}
		return ajaxResult;
	}

	@RequestMapping("/doEditAdmin")
	@ResponseBody
	public AjaxResult doEditAdmin(@ModelAttribute AdminInfo adminInfo) {
		ajaxResult.setSuccess(false);
		int flag = adminInfoService.updateAdmin(adminInfo);
		if(flag>0){ajaxResult.setSuccess(true);}
		return ajaxResult;
	}

    @RequestMapping("/adminlte/doEditMainInfo")
    @ResponseBody
    public AjaxResult alertMainInfoByOwn(@ModelAttribute AdminInfo adminInfo,HttpSession session){
       ajaxResult.setSuccess(false);
    	int flag = adminInfoService.updateAdmin(adminInfo);
    	//更新session
    	Map<String,Object> map = new HashMap<String,Object>();
    	AdminInfo adminInfo1 = adminInfoService.selectAdminById(adminInfo.getId());
    	 session.setAttribute(Constant.SESSION_ADMIN_INFO, adminInfo1);
    	 ajaxResult.setSuccess(true);
    	return ajaxResult;
    }
    
    //访问管理中心
    @RequestMapping("/adminlte/enIndex")
    public String enAdminLteIndex() {
    	return "admincenter/adminlte/index";
    }
    
    //访问基本信息页面
    @RequestMapping("/adminlte/enBasicInfo")
    public String enBasicInfo() {
    	return "admincenter/adminlte/basicinfo";
    }

	//访问企业管理页面
	@RequestMapping("/adminlte/enManageEnt")
	public String enResumeInfo() {
		return "admincenter/adminlte/manageEnt";
	}

	//访问HR用户管理
	@RequestMapping("/adminlte/enManageHr")
	public String enManageHr() {
		return "admincenter/adminlte/manageHr";
	}

	//访问实习生用户管理
	@RequestMapping("/adminlte/enManageIntern")
	public String enManageIntern() {
		return "admincenter/adminlte/manageIntern";
	}
	//访问管理员用户管理
	@RequestMapping("/adminlte/enManageAdmin")
	public String enManageAdmin() {
		return "admincenter/adminlte/manageAdmin";
	}

	//访问职位类别管理
	@RequestMapping("/adminlte/enManageCategory")
	public String enManageCategory() {
		return "admincenter/adminlte/manageCategory";
	}
//搜索Hr用户信息
	@RequestMapping("/searchHrList")
	@ResponseBody
	public BootsTable searchHrList(@RequestBody Map map) {
		int currentPage = (int)map.get("pageNumber");
		int length = (int)map.get("pageSize");
		int start = (currentPage-1)*length;
		map.put("start",start);
		map.put("length",length);
    	BootsTable bootsTable = new BootsTable();
		List<HrInfo> hrInfoList= hrInfoService.selectHrInfoList(map);
		int total = hrInfoService.selectHrInfoListCount(map);
		bootsTable.setRows(hrInfoList);
		bootsTable.setTotal(total);
		return bootsTable;
	}

	//删除Hr用户信息
	@RequestMapping("/delHr")
	@ResponseBody
	public AjaxResult delHr(@RequestParam String id) {
		AjaxResult ajaxResult = new AjaxResult();
		hrInfoService.deleteHrById(id);
		ajaxResult.setSuccess(true);
		return ajaxResult;
	}

	//删除实习生用户信息
	@RequestMapping("/delIntern")
	@ResponseBody
	public AjaxResult delIntern(@RequestParam String id) {
		AjaxResult ajaxResult = new AjaxResult();
		internInfoService.delIntern(id);
		ajaxResult.setSuccess(true);
		return ajaxResult;
	}

	//搜索实习生用户信息
	@RequestMapping("/searchInternList")
	@ResponseBody
	public BootsTable searchInternList(@RequestBody Map map) {
		int currentPage = (int)map.get("pageNumber");
		int length = (int)map.get("pageSize");
		int start = (currentPage-1)*length;
		map.put("start",start);
		map.put("length",length);
		BootsTable bootsTable = new BootsTable();
		List<InternInfo> internInfoList= internInfoService.getInternInfoList(map);
		int total = internInfoService.selectInternInfoListCount(map);
		bootsTable.setRows(internInfoList);
		bootsTable.setTotal(total);
		return bootsTable;
	}

}
