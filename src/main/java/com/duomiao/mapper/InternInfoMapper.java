package com.duomiao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.duomiao.entity.InternInfo;
import com.duomiao.entity.InternInfoExample;

public interface InternInfoMapper {
    long countByExample(InternInfoExample example);

    int deleteByExample(InternInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(InternInfo record);

    int insertSelective(InternInfo record);

    List<InternInfo> selectByExample(InternInfoExample example);

    InternInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InternInfo record, @Param("example") InternInfoExample example);

    int updateByExample(@Param("record") InternInfo record, @Param("example") InternInfoExample example);

    int updateByPrimaryKeySelective(InternInfo record);

    int updateByPrimaryKey(InternInfo record);
    /**
     * 自定义方法
     */
    List<InternInfo> selectInternInfoList(Map<String,Object> qryMap);
    int batchDelInternInfos(List<Integer> ids);
    int updateInternInfoForOwn(InternInfo internInfo);
    int specialUpdateInternInfo(Map<String,Object> qryMap);
    int specialDelInternInfoByState();
    int register(InternInfo internInfo);
    int sameName(String loginName);//重名校验
}