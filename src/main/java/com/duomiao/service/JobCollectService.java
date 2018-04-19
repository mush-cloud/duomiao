package com.duomiao.service;

import com.duomiao.entity.ResumeInfo;

import java.util.Map;

public interface JobCollectService {
    //
    public ResumeInfo selectMyResumeInfoByIdOrEmail(Map<String, String> map);

    //
    public int updateMyResumeInfoByEmail(Map<String, String> map);

    //
    public int insertMyResumeInfo(Map<String, String> map);
}
