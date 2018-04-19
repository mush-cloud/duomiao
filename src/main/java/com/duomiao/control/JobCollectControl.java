package com.duomiao.control;

import com.duomiao.entity.InternInfo;
import com.duomiao.entity.JobCollect;
import com.duomiao.service.JobCollectService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.BootsTable;
import com.duomiao.util.DateHelper;
import com.duomiao.util.UUIDBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/jobcollect")
public class JobCollectControl {
    @Autowired
    private JobCollectService jobCollectService;

    @RequestMapping("/getJobCollectList")
    @ResponseBody
    public BootsTable getJobCollectList() {
        BootsTable bt = new BootsTable();
        List<JobCollect> jobCollectList = new ArrayList<JobCollect>();
        JobCollect jobCollect = new JobCollect();
        jobCollect.setId("1");
        jobCollect.setEntName("2018-2-14");
        jobCollect.setPjName("xiaoxiao");
        JobCollect jobCollect1 = new JobCollect();
        jobCollect1.setId("2");
        jobCollect1.setEntName("2018-2-15");
        jobCollect1.setPjName("钉钉");
        jobCollectList.add(jobCollect);
        jobCollectList.add(jobCollect1);
        bt.setTotal(2);
        bt.setRows(jobCollectList);
        return bt;
    }

    //分页查询收藏的职位
    @RequestMapping("/listJobCollects")
    @ResponseBody
    public BootsTable getJobCollectList(@RequestParam Map<String, Object> map) {
        List<JobCollect> jobCollectList = jobCollectService.selectJobCollectListByTerms(map);
        int total = jobCollectService.selectJobCollectListCount(map);
        BootsTable bt = new BootsTable();
        bt.setTotal(total);
        bt.setRows(jobCollectList);
        return bt;
    }

    //删除
    @RequestMapping("/delJobCollect")
    @ResponseBody
    public AjaxResult delJobCollect(@RequestParam String id) {
        AjaxResult ajaxResult = new AjaxResult();
        jobCollectService.deleteById(id);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //添加，收藏
    @RequestMapping("/addJobCollect")
    @ResponseBody
    public AjaxResult addJobCollect(@ModelAttribute JobCollect jobCollect) {
        AjaxResult ajaxResult = new AjaxResult();
        String id = UUIDBuilder.createUUID();
        jobCollect.setId(id);
        jobCollect.setInputTime(DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
        jobCollectService.insertJobCollect(jobCollect);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

}
