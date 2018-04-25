package com.duomiao.mapper;

import com.duomiao.entity.AdminInfo;
import com.duomiao.entity.AdminInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminInfoMapper {
    long countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    AdminInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);

    int updateAdmin(AdminInfo adminInfo);
    int insertAdmin(AdminInfo adminInfo);

    List<AdminInfo> selectLoginAdmin(AdminInfo adminInfo);

    List<AdminInfo> selectRepeatAdmin(String adminName);
    List<AdminInfo>  selectAdmins(Map map);

}