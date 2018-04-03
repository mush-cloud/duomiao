package com.duomiao.mapper;

import com.duomiao.entity.JobReply;
import com.duomiao.entity.JobReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobReplyMapper {
    long countByExample(JobReplyExample example);

    int deleteByExample(JobReplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(JobReply record);

    int insertSelective(JobReply record);

    List<JobReply> selectByExampleWithBLOBs(JobReplyExample example);

    List<JobReply> selectByExample(JobReplyExample example);

    JobReply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JobReply record, @Param("example") JobReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") JobReply record, @Param("example") JobReplyExample example);

    int updateByExample(@Param("record") JobReply record, @Param("example") JobReplyExample example);

    int updateByPrimaryKeySelective(JobReply record);

    int updateByPrimaryKeyWithBLOBs(JobReply record);

    int updateByPrimaryKey(JobReply record);
}