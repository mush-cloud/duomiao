package com.duomiao.service.impl;

import com.duomiao.entity.EntResume;
import com.duomiao.mapper.EntResumeMapper;
import com.duomiao.service.EntResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EntResumeServiceImpl implements EntResumeService{
    @Autowired
    private EntResumeMapper entResumeMapper;

    @Override
    public int updateForFakeDel(Map map) {
        return entResumeMapper.updateForFakeDel(map);
    }

    @Override
    public int recoverEntResumeById(String id) {
        return entResumeMapper.recoverEntResumeById(id);
    }

    @Override
    public List<EntResume> selectByMap(Map map) {
        return entResumeMapper.selectByMap(map);
    }

    @Override
    public List<EntResume> selectDelData() {
        return entResumeMapper.selectDelData();
    }

    @Override
    public int insertEntResume(Map map) {
        return entResumeMapper.insertEntResume(map);
    }
    //系统定时删除无效数据  无效的状态为1
    @Override
    public int deleteInvalidData() {
        return entResumeMapper.deleteInvalidData();
    }

    @Override
    public int getTotal(Map map) {
        return entResumeMapper.getTotal(map);
    }

    @Override
    public int checkSend(Map map) {
        return entResumeMapper.checkSend(map);
    }
}
