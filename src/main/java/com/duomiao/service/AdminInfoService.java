package com.duomiao.service;

import com.duomiao.entity.AdminInfo;

import java.util.List;
import java.util.Map;

public interface AdminInfoService {
    int deleteByPrimaryKey(String id);
    int updateAdmin(AdminInfo adminInfo);
    int insertAdmin(AdminInfo adminInfo);
    List<AdminInfo>  selectAdmins(Map map);
    AdminInfo selectLoginAdmin(AdminInfo adminInfo);
   AdminInfo selectRepeatAdmin(String adminName);
    AdminInfo selectAdminById(String id);
}
