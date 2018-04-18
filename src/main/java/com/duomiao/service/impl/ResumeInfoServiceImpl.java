package com.duomiao.service.impl;

import com.duomiao.entity.ResumeInfo;
import com.duomiao.mapper.ResumeInfoMapper;
import com.duomiao.service.ResumeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class ResumeInfoServiceImpl implements ResumeInfoService{
    @Autowired
    private ResumeInfoMapper resumeInfoMapper;
    //查看简历
    @Override
    public ResumeInfo selectMyResumeInfoByIdOrEmail(Map<String, String> map) {
        return resumeInfoMapper.selectResumeInfoByIDOrEmail(map);
    }
//修改简历
    @Override
    public int updateMyResumeInfoByEmail(Map<String, String> map) {

        return resumeInfoMapper.updateMyResumeInfoByEmail(map) ;
    }
//创建简历
    @Override
    public int insertMyResumeInfo(Map<String, String> map) {
        return resumeInfoMapper.insertMyResumeInfo(map);
    }
}
