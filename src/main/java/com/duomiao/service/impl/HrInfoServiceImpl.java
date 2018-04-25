package com.duomiao.service.impl;

import com.duomiao.entity.HrInfo;
import com.duomiao.mapper.HrInfoMapper;
import com.duomiao.service.HrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class HrInfoServiceImpl implements HrInfoService {
    @Autowired
    private HrInfoMapper hrInfoMapper;
    @Override
    public List<HrInfo> selectHrInfoList(Map map) {
        return hrInfoMapper.selectHrInfoList(map);
    }

    @Override
    public int selectHrInfoListCount(Map map) {
        return hrInfoMapper.selectHrInfoListCount(map);
    }

    @Override
    public int insertHrInfo(HrInfo hrInfo) {
        return hrInfoMapper.insertHrInfo(hrInfo);
    }

    @Override
    public HrInfo selectMyHrInfo(HrInfo hrInfo) {
        List<HrInfo> hrInfoList = hrInfoMapper.selectMyHrInfo(hrInfo);
        if(hrInfoList!=null&&hrInfoList.size()>0){
            return hrInfoList.get(0);
        }
        return null;
    }
//根据ID修改
    @Override
    public int updateMyHrInfo(Map map) {
        return hrInfoMapper.updateMyHrInfo(map);
    }

    @Override
    public int deleteHrById(String id) {
        return hrInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int validateSameName(String hrName) {
        Map map = new HashMap();
        map.put("hrName",hrName);
        List<HrInfo> hrInfoList = hrInfoMapper.selectHrInfoList(map);
        if(hrInfoList!=null&&hrInfoList.size()>0){
            return 1;
        }
        return 0;
    }
}
