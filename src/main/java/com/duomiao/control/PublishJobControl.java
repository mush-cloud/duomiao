package com.duomiao.control;

import com.duomiao.entity.HrInfo;
import com.duomiao.entity.PublishJob;
import com.duomiao.service.PublishJobService;
import com.duomiao.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//已发布职位控制类
@Controller
@RequestMapping("/pubJob")
public class PublishJobControl {
    @Autowired
    private PublishJobService publishJobService;

    //Hr获取自己发布的所有职位信息,前端分页。无条件查询（只有一个公司id）
    @RequestMapping("/hr/getMyPubJobs")
    @ResponseBody
    public BootsTable getMyPubJobs(HttpSession session){
        HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
        BootsTable bootsTable = new BootsTable();
        Map map = new HashMap();
        map.put("entId",hrInfo.getEntid());
        List<PublishJob> publishJobList = publishJobService.selectMyPubJobs(map);
        bootsTable.setRows(publishJobList);
        bootsTable.setTotal(publishJobList.size());
        return  bootsTable;
    }

    //Hr发布职位
    @RequestMapping("/hr/createPubJob")
    @ResponseBody
    public AjaxResult createPubJob(@ModelAttribute PublishJob publishJob,HttpSession session){
        AjaxResult ajaxResult = new AjaxResult();
        publishJob.setId(UUIDBuilder.createUUID());
        HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
        publishJob.setEntId(hrInfo.getEntid());
        publishJob.setSendNum(0);
        publishJob.setUpdateTime(DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
        publishJobService.insertPubJob(publishJob);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //Hr删除职位
    @RequestMapping("/hr/delPubJob")
    @ResponseBody
    public AjaxResult delPubJob(@RequestParam String id,HttpSession session){
        AjaxResult ajaxResult = new AjaxResult();
        publishJobService.deleteById(id);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //Hr修改职位，根据职位id
    @RequestMapping("/hr/editMyPubJob")
    @ResponseBody
    public AjaxResult editMyPubJob(@RequestParam Map map){
        AjaxResult ajaxResult = new AjaxResult();
        map.put("updateTime",DateHelper.getFormatDate("yyyy-MM-dd HH:mm:ss", new Date()));
        publishJobService.updateMyPubJobById(map);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //一级职位类别查询
    @RequestMapping("/selectPubJobsOne")
    @ResponseBody
    public AjaxResult selectPubJobsOne(@RequestParam Map map){
        AjaxResult ajaxResult = new AjaxResult();
        //TODO 职位类别查询返回ID值,返回值为确认何种形式
        List<PublishJob> publishJobList = publishJobService.selectPublicMethodOne(map);//条件（arrId,start,length)
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //搜索框查询执行
    @RequestMapping("/searchPubJobs")
    @ResponseBody
    public AjaxResult searchPubJobs(@RequestParam Map map){//表单还是json格式 每页8条数据
        AjaxResult ajaxResult = new AjaxResult();
        map.put("length",8);
        map.put("start",(int)map.get("currentPage")*8);
        List<PublishJob> publishJobList = publishJobService.selectPublicMethodTwo(map);//当前页的数据
        Map<String,Object> resMap = new HashMap<String,Object>();
        int total = publishJobService.selectPublicMethodTwoCount(map);//总记录数
        int totalPage = (total+8-1)/8;
        resMap.put("totalPage",totalPage);//总页数
        resMap.put("total",total);
        resMap.put("publishJobList",publishJobList);
        ajaxResult.setSuccess(true);
        ajaxResult.setMessage(resMap);
        return ajaxResult;
    }

    //二级查询执行,二级pcId
    @RequestMapping("/selectPubJobsTwo")
    @ResponseBody
    public AjaxResult selectPubJobsTwo(@RequestParam Map map){//表单还是json格式 每页8条数据
        AjaxResult ajaxResult = new AjaxResult();
        List<PublishJob> publishJobList = publishJobService.selectPublicMethodTwo(map);//分页当前页内容
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("publishJobList",publishJobList);
        ajaxResult.setSuccess(true);
        ajaxResult.setMessage(resMap);
        return ajaxResult;
    }

    //获取职位详情内容
    @RequestMapping("/getPubJobInfoById")
    @ResponseBody
    public PublishJob getPubJobInfoById(@RequestParam String id){
        PublishJob publishJob = publishJobService.selectPubJobById(id);
        return publishJob;
    }
    //8个热门职位
    @RequestMapping("/getHotPubJob")
    @ResponseBody
    public List<PublishJob> getHotPubJob(){
        return publishJobService.selectHotPubJob();
    }

    //8个最新职位
    @RequestMapping("/getNewPubJob")
    @ResponseBody
    public List<PublishJob> getNewPubJob(){
        return publishJobService.selectNewPubJob();
    }
}
