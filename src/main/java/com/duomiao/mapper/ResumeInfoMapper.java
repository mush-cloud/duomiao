package com.duomiao.mapper;

import com.duomiao.entity.ResumeInfo;
import com.duomiao.entity.ResumeInfoExample;
import com.duomiao.entity.ResumeInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeInfoMapper {
    long countByExample(ResumeInfoExample example);

    int deleteByExample(ResumeInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResumeInfoWithBLOBs record);

    int insertSelective(ResumeInfoWithBLOBs record);

    List<ResumeInfoWithBLOBs> selectByExampleWithBLOBs(ResumeInfoExample example);

    List<ResumeInfo> selectByExample(ResumeInfoExample example);

    ResumeInfoWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResumeInfoWithBLOBs record, @Param("example") ResumeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ResumeInfoWithBLOBs record, @Param("example") ResumeInfoExample example);

    int updateByExample(@Param("record") ResumeInfo record, @Param("example") ResumeInfoExample example);

    int updateByPrimaryKeySelective(ResumeInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResumeInfoWithBLOBs record);

    int updateByPrimaryKey(ResumeInfo record);
}