package com.duomiao.mapper;

import com.duomiao.entity.PositionCategory;
import com.duomiao.entity.PositionCategoryExample;
import java.util.List;
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
}