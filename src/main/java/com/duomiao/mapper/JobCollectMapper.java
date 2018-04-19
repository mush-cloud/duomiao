package com.duomiao.mapper;

import com.duomiao.entity.JobCollect;
import com.duomiao.entity.JobCollectExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface JobCollectMapper {
    long countByExample(JobCollectExample example);

    int deleteByExample(JobCollectExample example);
//根据ID删除职位收藏表记录
    int deleteByPrimaryKey(String id);

    int insert(JobCollect record);

    int insertSelective(JobCollect record);

    List<JobCollect> selectByExample(JobCollectExample example);

    JobCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobCollect record, @Param("example") JobCollectExample example);

    int updateByExample(@Param("record") JobCollect record, @Param("example") JobCollectExample example);

    int updateByPrimaryKeySelective(JobCollect record);

    int updateByPrimaryKey(JobCollect record);
//添加收藏职位
    int insertJobCollect(JobCollect jobCollect);
    //分页查询 start,length
    List<JobCollect>  selectJobCollectListByTerms(Map<String,Object> map);
}