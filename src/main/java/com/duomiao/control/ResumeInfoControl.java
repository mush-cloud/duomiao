package com.duomiao.control;

import com.duomiao.entity.ResumeInfo;
import com.duomiao.service.ResumeInfoService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.UUIDBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/resume")
public class ResumeInfoControl {//@RequestParam（适用于post表单请求） @RequestBody使用一（json数据）
    @Autowired
    private ResumeInfoService resumeInfoService;
    //个人简历信息获取
    @RequestMapping("intern/getMyResumeInfo")
    @ResponseBody
    public ResumeInfo getMyResumeInfo(@RequestParam(value ="email",required = false) String email){
        Map<String,String> map = new HashMap<String,String>();
        map.put("email",email);
       ResumeInfo resumeInfo =  resumeInfoService.selectMyResumeInfoByIdOrEmail(map);
        return  resumeInfo;
    }

    //创建个人简历
    @RequestMapping("intern/doMakeResumeInfo")
    @ResponseBody
    public AjaxResult doMakeResumeInfo(@RequestParam Map<String,String> map){
        String id = UUIDBuilder.createUUID();
        map.put("id",id);
        AjaxResult ajaxResult = new AjaxResult();
        resumeInfoService.insertMyResumeInfo(map);
        ajaxResult.setSuccess(true);;
        return  ajaxResult;
    }

    //修改个人简历
    @RequestMapping("intern/doEditResumeInfo")
    @ResponseBody
    public AjaxResult doEditResumeInfo(@RequestParam Map<String,String> map){
        AjaxResult ajaxResult = new AjaxResult();
        resumeInfoService.updateMyResumeInfoByEmail(map);
        ajaxResult.setSuccess(true);;
        return  ajaxResult;
    }


    //企业查看简历详情
    @RequestMapping("hr/browseResumeInfo")
    @ResponseBody
    public ResumeInfo browseResumeInfo(@RequestParam(value ="id",required = false) String id){
        Map<String,String> map = new HashMap<String,String>();
        map.put("id",id);
        ResumeInfo resumeInfo =  resumeInfoService.selectMyResumeInfoByIdOrEmail(map);
        return  resumeInfo;
    }
}
