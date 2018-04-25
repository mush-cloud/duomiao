package com.duomiao.mapper;

import com.duomiao.entity.PositionCategory;
import com.duomiao.entity.PositionCategoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PositionCategoryMapper {
    long countByExample(PositionCategoryExample example);

    int deleteByExample(PositionCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(PositionCategory record);

    int insertSelective(PositionCategory record);

    List<PositionCategory> selectByExample(PositionCategoryExample example);

    PositionCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PositionCategory record, @Param("example") PositionCategoryExample example);

    int updateByExample(@Param("record") PositionCategory record, @Param("example") PositionCategoryExample example);

    int updateByPrimaryKeySelective(PositionCategory record);

    int updateByPrimaryKey(PositionCategory record);
    //添加职位类别，基类和二级类公共方法
    int insertCategory(PositionCategory positionCategory);
    //删除职位（二级）
    int deleteByFatherId(String id);
    //查找职位类别（二级）
    List<PositionCategory>  selectByFatherId(String id);
    //修改根据Id
    int updateById(Map map);
    List<PositionCategory> selectBaseKinds();
    List<PositionCategory> selectAllChild();



}