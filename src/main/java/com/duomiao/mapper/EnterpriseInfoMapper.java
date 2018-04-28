package com.duomiao.mapper;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.entity.EnterpriseInfoExample;
import com.duomiao.entity.EnterpriseInfoWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EnterpriseInfoMapper {
    long countByExample(EnterpriseInfoExample example);

    int deleteByExample(EnterpriseInfoExample example);
//删除
    int deleteByPrimaryKey(String id);

    int insert(EnterpriseInfoWithBLOBs record);

    int insertSelective(EnterpriseInfoWithBLOBs record);

    List<EnterpriseInfoWithBLOBs> selectByExampleWithBLOBs(EnterpriseInfoExample example);

    List<EnterpriseInfo> selectByExample(EnterpriseInfoExample example);

    EnterpriseInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnterpriseInfoWithBLOBs record, @Param("example") EnterpriseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") EnterpriseInfoWithBLOBs record, @Param("example") EnterpriseInfoExample example);

    int updateByExample(@Param("record") EnterpriseInfo record, @Param("example") EnterpriseInfoExample example);

    int updateByPrimaryKeySelective(EnterpriseInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EnterpriseInfoWithBLOBs record);

    int updateByPrimaryKey(EnterpriseInfo record);
    //hr修改公司信息
    int updateById(EnterpriseInfo enterpriseInfo);


    //hr查看公司信息
    List<EnterpriseInfo> selectByEntId(String id);

    //hr注册公司信息
    int insertMyEnt(EnterpriseInfo enterpriseInfo);
    //管理员分页查看
    List<EnterpriseInfo> selectEntInfoList(Map map);

    //查看总记录数
    int selectEntInfoListCount(Map map);

}