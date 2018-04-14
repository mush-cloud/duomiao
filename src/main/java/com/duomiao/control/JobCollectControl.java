package com.duomiao.control;

import com.duomiao.entity.JobCollect;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.BootsTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jobcollect")
public class JobCollectControl {
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
}
