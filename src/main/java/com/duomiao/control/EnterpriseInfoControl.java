package com.duomiao.control;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.service.EnterpriseInfoService;
import com.duomiao.util.AjaxResult;
import com.duomiao.util.BootsTable;
import com.duomiao.util.UUIDBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/entInfo")
public class EnterpriseInfoControl {
    @Autowired
    private EnterpriseInfoService enterpriseInfoService;
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

    //HR注册公司信息
    @RequestMapping("/hr/addEntInfo")
    @ResponseBody
    public AjaxResult addEntInfo(@ModelAttribute EnterpriseInfo enterpriseInfo) {
        enterpriseInfo.setId(UUIDBuilder.createUUID());
        //进行企业审核,这里设为有效
        enterpriseInfo.setStatus("1");
        AjaxResult ajaxResult = new AjaxResult();
        enterpriseInfoService.insertEnterpriseInfo(enterpriseInfo);
        ajaxResult.setSuccess(true);
        //TODO 修改HR的企业id
        return ajaxResult;
    }

    //管理员分页查看
    @RequestMapping("/admin/getEntInfoList")
    @ResponseBody
    public BootsTable getEntInfoList(@RequestParam Map map) {
     BootsTable bt = new BootsTable();
        List<EnterpriseInfo> enterpriseInfoList = enterpriseInfoService.selectEntInfoList(map);
       int total = enterpriseInfoService.selectEntInfoListCount(map);
        bt.setRows(enterpriseInfoList);
        bt.setTotal(total);
        return bt;
    }

}
