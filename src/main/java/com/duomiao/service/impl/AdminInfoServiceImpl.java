package com.duomiao.service.impl;

import com.duomiao.entity.AdminInfo;
import com.duomiao.mapper.AdminInfoMapper;
import com.duomiao.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {
    @Autowired
    private AdminInfoMapper adminInfoMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return adminInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateAdmin(AdminInfo adminInfo) {
        return adminInfoMapper.updateAdmin(adminInfo);
    }

    @Override
    public int insertAdmin(AdminInfo adminInfo) {
        return adminInfoMapper.insertAdmin(adminInfo);
    }

    @Override
    public AdminInfo selectLoginAdmin(AdminInfo adminInfo) {
        List<AdminInfo> adminInfoList = adminInfoMapper.selectLoginAdmin(adminInfo);
        if(adminInfoList!=null&&adminInfoList.size()>0){
            return adminInfoList.get(0);
        }
        return null;
    }

    @Override
    public AdminInfo selectRepeatAdmin(String adminName) {
        List<AdminInfo> adminInfoList = adminInfoMapper.selectRepeatAdmin(adminName);
        if(adminInfoList!=null&&adminInfoList.size()>0){
            return adminInfoList.get(0);
        }
        return null;
    }

    @Override
    public List<AdminInfo> selectAdmins(Map map) {
        return adminInfoMapper.selectAdmins(map);
    }

    @Override
    public AdminInfo selectAdminById(String id) {
        return adminInfoMapper.selectByPrimaryKey(id);
    }
}
