package com.duomiao.control;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.entity.HrInfo;
import com.duomiao.service.EnterpriseInfoService;
import com.duomiao.service.HrInfoService;
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
@RequestMapping("/entInfo")
public class EnterpriseInfoControl {
    @Autowired
    private EnterpriseInfoService enterpriseInfoService;
    @Autowired
    private HrInfoService hrInfoService;
//查看HR公司信息
    @RequestMapping("/hr/getMyEntInfo")
    @ResponseBody
    public EnterpriseInfo getMyEntInfo(@RequestParam String id) {
       return enterpriseInfoService.selectByEntId(id);
    }

    //管理员删除公司
    @RequestMapping("/admin/delEntInfoById")
    @ResponseBody
    public AjaxResult delEntInfoById(@RequestParam String id) {
        AjaxResult ajaxResult = new AjaxResult();
        enterpriseInfoService.deleteEnterpriseInfoById(id);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

 //HR修改公司
    @RequestMapping("/hr/editEntInfo")
    @ResponseBody
    public AjaxResult editEntInfo(@ModelAttribute EnterpriseInfo enterpriseInfo, HttpSession session) {
        enterpriseInfo.setStatus("1");
        AjaxResult ajaxResult = new AjaxResult();
        HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
        if(hrInfo!=null){
            //企业图像与Hr图像一致
            enterpriseInfo.setImgUrl(hrInfo.getImgUrl());
        }
        enterpriseInfoService.insertEnterpriseInfo(enterpriseInfo);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }


    //HR注册公司信息
    @RequestMapping("/hr/addEntInfo")
    @ResponseBody
    public AjaxResult addEntInfo(@ModelAttribute EnterpriseInfo enterpriseInfo, HttpSession session) {
        enterpriseInfo.setId(UUIDBuilder.createUUID());
        //进行企业审核,这里设为有效
        enterpriseInfo.setStatus("1");
        AjaxResult ajaxResult = new AjaxResult();
        HrInfo hrInfo = (HrInfo) session.getAttribute(Constant.SESSION_HR_INFO);
        if(hrInfo!=null){
            Map map = new HashMap();
            String entid = enterpriseInfo.getId();
            map.put("id",hrInfo.getId());
            map.put("entid",entid);
            hrInfoService.updateMyHrInfo(map);
            //企业图像与Hr图像一致
            enterpriseInfo.setImgUrl(hrInfo.getImgUrl());

        }
        enterpriseInfoService.insertEnterpriseInfo(enterpriseInfo);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //管理员分页查看
    @RequestMapping("/admin/getEntInfoList")
    @ResponseBody
    public BootsTable getEntInfoList(@RequestBody Map map) {
        int currentPage = (int)map.get("pageNumber");
        int length = (int)map.get("pageSize");
        int start = (currentPage-1)*length;
        map.put("start",start);
        map.put("length",length);
     BootsTable bt = new BootsTable();
        List<EnterpriseInfo> enterpriseInfoList = enterpriseInfoService.selectEntInfoList(map);
       int total = enterpriseInfoService.selectEntInfoListCount(map);
        bt.setRows(enterpriseInfoList);
        bt.setTotal(total);
        return bt;
    }

}
