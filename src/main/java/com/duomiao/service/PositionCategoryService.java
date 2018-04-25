package com.duomiao.service;

import com.duomiao.entity.PositionCategory;

import java.util.List;
import java.util.Map;

public interface PositionCategoryService {
 //职位类别对象具体信息
    PositionCategory selectById(String id);
    //添加职位类别，基类和二级类公共方法
    int insertCategory(PositionCategory positionCategory);
    //del 自己一级
    int deleteById(String id);
    //删除职位（二级）
    int deleteByFatherId(String id);
    //查找职位类别（二级）
    List<PositionCategory>  selectByFatherId(String id);
    //修改根据Id
    int updateById(Map map);
    //职位一级集合
    List<PositionCategory> selectBaseKinds();
   List<PositionCategory> selectAllChild();
}
