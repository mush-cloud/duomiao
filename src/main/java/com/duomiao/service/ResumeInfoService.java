package com.duomiao.service;

import com.duomiao.entity.ResumeInfo;

import java.util.Map;

public interface ResumeInfoService {
    //查看简历
    public ResumeInfo selectMyResumeInfoByIdOrEmail(Map<String,String> map);

    //修改简历
    public int updateMyResumeInfoByEmail(Map<String,String> map);

    //创建简历
    public int insertMyResumeInfo(Map<String,String> map);
}
