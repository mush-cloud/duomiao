package com.duomiao.mapper;

import com.duomiao.entity.HrInfo;
import com.duomiao.entity.HrInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HrInfoMapper {
    long countByExample(HrInfoExample example);

    int deleteByExample(HrInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(HrInfo record);

    int insertSelective(HrInfo record);

    List<HrInfo> selectByExample(HrInfoExample example);

    HrInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HrInfo record, @Param("example") HrInfoExample example);

    int updateByExample(@Param("record") HrInfo record, @Param("example") HrInfoExample example);

    int updateByPrimaryKeySelective(HrInfo record);

    int updateByPrimaryKey(HrInfo record);

    List<HrInfo> selectHrInfoList(Map map);

    int selectHrInfoListCount(Map map);

    int insertHrInfo(HrInfo hrInfo);

    List<HrInfo> selectMyHrInfo(HrInfo hrInfo);

    int updateMyHrInfo(Map map);



}