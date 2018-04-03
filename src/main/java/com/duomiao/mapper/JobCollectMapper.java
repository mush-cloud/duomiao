package com.duomiao.mapper;

import com.duomiao.entity.JobCollect;
import com.duomiao.entity.JobCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCollectMapper {
    long countByExample(JobCollectExample example);

    int deleteByExample(JobCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(JobCollect record);

    int insertSelective(JobCollect record);

    List<JobCollect> selectByExample(JobCollectExample example);

    JobCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobCollect record, @Param("example") JobCollectExample example);

    int updateByExample(@Param("record") JobCollect record, @Param("example") JobCollectExample example);

    int updateByPrimaryKeySelective(JobCollect record);

    int updateByPrimaryKey(JobCollect record);
}