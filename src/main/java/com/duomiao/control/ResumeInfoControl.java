package com.duomiao.control;

import com.duomiao.entity.ResumeInfo;
import com.duomiao.service.ResumeInfoService;
import com.duomiao.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/resume")
public class ResumeInfoControl {
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

}
