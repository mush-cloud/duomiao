package com.duomiao.mapper;

import com.duomiao.entity.EntResume;
import com.duomiao.entity.EntResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntResumeMapper {
    long countByExample(EntResumeExample example);

    int deleteByExample(EntResumeExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntResume record);

    int insertSelective(EntResume record);

    List<EntResume> selectByExample(EntResumeExample example);

    EntResume selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntResume record, @Param("example") EntResumeExample example);

    int updateByExample(@Param("record") EntResume record, @Param("example") EntResumeExample example);

    int updateByPrimaryKeySelective(EntResume record);

    int updateByPrimaryKey(EntResume record);
}