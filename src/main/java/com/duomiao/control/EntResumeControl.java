package com.duomiao.control;

import com.duomiao.entity.EntResume;
import com.duomiao.entity.HrInfo;
import com.duomiao.entity.ResumeInfo;
import com.duomiao.service.EntResumeService;
import com.duomiao.service.ResumeInfoService;
import com.duomiao.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//企业&简历关系表对应访问控制类
@Controller
@RequestMapping("/entResume")
public class EntResumeControl {
    @Autowired
    private EntResumeService entResumeService;
    @Autowired
    private ResumeInfoService resumeInfoService;

    //TODO解决重复投递


    //Hr分页获取有效的信息,map（“”，“”，“”）
    @RequestMapping("/hr/getValidEntResumes")
    @ResponseBody
    public  List<EntResume>  getValidEntResumes(HttpSession session,@RequestParam Map map){
        HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
        map.put("entId",hrInfo.getEntid());
        List<EntResume> entResumeList = entResumeService.selectByMap(map);
        return  entResumeList;
    }


    @RequestMapping("/hr/checkResume")
    @ResponseBody
    public ResumeInfo checkResume(@RequestParam String id){
        Map map = new HashMap();
        map.put("id",id);
        return  resumeInfoService.selectMyResumeInfoByIdOrEmail(map);
    }


    //Hr删除数据(假删除 ，根据id删除)
    @RequestMapping("/hr/updateForFakeDel")
    @ResponseBody
    public AjaxResult updateForFakeDel(@RequestParam Map map,HttpSession session){
        map.put("delTime",DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
        AjaxResult ajaxResult = new AjaxResult();
        entResumeService.updateForFakeDel(map);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //投递简历时创建EntResume(实习生必须在登录状态,传入实习生账户 email)    map(email,entId,pjId)
    @RequestMapping("/intern/createEntResume")
    @ResponseBody
    public AjaxResult createEntResume(@RequestParam Map map,HttpSession session){
        Map qry = new HashMap();
        AjaxResult ajaxResult = new AjaxResult();
        Map<String,String> map2 = new HashMap<>();
        map2.put("email",(String)map.get("email"));
        ResumeInfo resumeInfo = resumeInfoService.selectMyResumeInfoByIdOrEmail(map2);
        if(resumeInfo!=null){
            qry.put("riId",resumeInfo.getId());
        }else{
            qry.put("riId","");
        }
        qry.put("pjId",map.get("pjId"));
        int count = entResumeService.checkSend(qry);
        if(count>0){
            ajaxResult.setSuccess(false);
            return  ajaxResult;
        }else {
            map.put("riId",resumeInfo.getId());
            map.put("sex", resumeInfo.getSex());
            map.put("id", UUIDBuilder.createUUID());
            map.put("academic", resumeInfo.getAcademic());
            map.put("age", resumeInfo.getAge());
            map.put("isdel", "0");
            map.put("id", UUIDBuilder.createUUID());
            map.put("addTime", DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
            entResumeService.insertEntResume(map);
            ajaxResult.setSuccess(true);
            return ajaxResult;
        }
    }

    //恢复已删除数据
    @RequestMapping("/hr/recoverDelData")
    @ResponseBody
    public AjaxResult recoverDelData(@RequestParam String id){
        AjaxResult ajaxResult = new AjaxResult();
        entResumeService.recoverEntResumeById(id);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //获取无效数据列表
    @RequestMapping("/hr/getInvalidData")//不分页或客户端分页
    @ResponseBody
    public BootsTable getInvalidData(){
        BootsTable bootsTable = new BootsTable();
        List<EntResume> entResumeList = entResumeService.selectDelData();
        Map<String,Object> resMap = new HashMap<String,Object>();
        bootsTable.setTotal(entResumeList.size());
        bootsTable.setRows(entResumeList);
        return bootsTable;
    }
}
