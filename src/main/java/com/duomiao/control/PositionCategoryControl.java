package com.duomiao.control;

import com.duomiao.entity.HrInfo;
import com.duomiao.entity.PositionCategory;
import com.duomiao.entity.PublishJob;
import com.duomiao.service.PositionCategoryService;
import com.duomiao.service.PublishJobService;
import com.duomiao.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//职位类别控制类
@Controller
@RequestMapping("/posCate")
public class PositionCategoryControl {
    @Autowired
    private PositionCategoryService positionCategoryService;



    //首页获取相对应的二级类别
    @RequestMapping("/listChildPositionCategorys")
    @ResponseBody
    public List<PositionCategory>  listPositionCategory(@RequestParam String id){
        List<PositionCategory> baseCateList = positionCategoryService.selectByFatherId(id);
        return  baseCateList;
    }

    //首页获取所有的职位类别信息
    @RequestMapping("/listPositionCategorys")
    @ResponseBody
    public BootsTable listPositionCategory(HttpSession session){
        BootsTable bootsTable = new BootsTable();
        List<PositionCategory> baseCateList = positionCategoryService.selectBaseKinds();
        for(PositionCategory positionCategory : baseCateList){
        }
        return  bootsTable;
    }

    //admin获取所有的大类职位类别信息
    @RequestMapping("/admin/listBigPositionCategorys")
    @ResponseBody
    public   List<PositionCategory>  listBigPositionCategorys(){
        List<PositionCategory> baseCateList = positionCategoryService.selectBaseKinds();
        return  baseCateList;
    }

    //admin修改职位类别
    @RequestMapping("/admin/editPosCate")
    @ResponseBody
    public AjaxResult editPosCate(@RequestParam Map map,HttpSession session){
        positionCategoryService.updateById(map);
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //admin新增一级类别
    @RequestMapping("/admin/addBasePosCate")
    @ResponseBody
    public AjaxResult addPosCate(@ModelAttribute PositionCategory positionCategory){
        AjaxResult ajaxResult = new AjaxResult();
        positionCategory.setId(UUIDBuilder.createUUID());
        positionCategory.setFatherId("0");
        positionCategoryService.insertCategory(positionCategory);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //admin新增二级类别
    @RequestMapping("/admin/addChildPosCate")
    @ResponseBody
    public AjaxResult addChildPosCate(@ModelAttribute PositionCategory positionCategory){
        AjaxResult ajaxResult = new AjaxResult();
        positionCategory.setId(UUIDBuilder.createUUID());
        positionCategoryService.insertCategory(positionCategory);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

    //admin删除类别
    @RequestMapping("/admin/delPosCate")
    @ResponseBody
    public AjaxResult delPosCate(@RequestParam String id){
        AjaxResult ajaxResult = new AjaxResult();
        positionCategoryService.deleteByFatherId(id);
        positionCategoryService.deleteById(id);
        ajaxResult.setSuccess(true);
        return ajaxResult;
    }

}
