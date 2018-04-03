package com.duomiao.mapper;

import com.duomiao.entity.EntCollect;
import com.duomiao.entity.EntCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntCollectMapper {
    long countByExample(EntCollectExample example);

    int deleteByExample(EntCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntCollect record);

    int insertSelective(EntCollect record);

    List<EntCollect> selectByExample(EntCollectExample example);

    EntCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntCollect record, @Param("example") EntCollectExample example);

    int updateByExample(@Param("record") EntCollect record, @Param("example") EntCollectExample example);

    int updateByPrimaryKeySelective(EntCollect record);

    int updateByPrimaryKey(EntCollect record);
}