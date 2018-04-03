package com.duomiao.mapper;

import com.duomiao.entity.PublishJob;
import com.duomiao.entity.PublishJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishJobMapper {
    long countByExample(PublishJobExample example);

    int deleteByExample(PublishJobExample example);

    int deleteByPrimaryKey(String id);

    int insert(PublishJob record);

    int insertSelective(PublishJob record);

    List<PublishJob> selectByExampleWithBLOBs(PublishJobExample example);

    List<PublishJob> selectByExample(PublishJobExample example);

    PublishJob selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByExampleWithBLOBs(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByExample(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByPrimaryKeySelective(PublishJob record);

    int updateByPrimaryKeyWithBLOBs(PublishJob record);

    int updateByPrimaryKey(PublishJob record);
}