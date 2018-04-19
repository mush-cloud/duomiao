package com.duomiao.service.impl;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.mapper.EnterpriseInfoMapper;
import com.duomiao.service.EnterpriseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {
    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;
    @Override
    public EnterpriseInfo selectByEntId(String id) {
        return enterpriseInfoMapper.selectByEntId(id).get(0);
    }

    @Override
    public int deleteEnterpriseInfoById(String id) {
        return enterpriseInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertEnterpriseInfo(EnterpriseInfo enterpriseInfo) {
        return enterpriseInfoMapper.insertMyEnt(enterpriseInfo);
    }

    @Override
    public List<EnterpriseInfo> selectEntInfoList(Map map) {
        return enterpriseInfoMapper.selectEntInfoList(map);
    }

    @Override
    public int selectEntInfoListCount(Map map) {
        return enterpriseInfoMapper.selectEntInfoListCount(map);
    }
}
