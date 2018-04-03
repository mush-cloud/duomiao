package com.duomiao.mapper;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.entity.EnterpriseInfoExample;
import com.duomiao.entity.EnterpriseInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseInfoMapper {
    long countByExample(EnterpriseInfoExample example);

    int deleteByExample(EnterpriseInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(EnterpriseInfoWithBLOBs record);

    int insertSelective(EnterpriseInfoWithBLOBs record);

    List<EnterpriseInfoWithBLOBs> selectByExampleWithBLOBs(EnterpriseInfoExample example);

    List<EnterpriseInfo> selectByExample(EnterpriseInfoExample example);

    EnterpriseInfoWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnterpriseInfoWithBLOBs record, @Param("example") EnterpriseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") EnterpriseInfoWithBLOBs record, @Param("example") EnterpriseInfoExample example);

    int updateByExample(@Param("record") EnterpriseInfo record, @Param("example") EnterpriseInfoExample example);

    int updateByPrimaryKeySelective(EnterpriseInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EnterpriseInfoWithBLOBs record);

    int updateByPrimaryKey(EnterpriseInfo record);
}