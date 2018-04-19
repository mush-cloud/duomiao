package com.duomiao.service;

import com.duomiao.entity.JobCollect;
import com.duomiao.entity.ResumeInfo;

import java.util.List;
import java.util.Map;

public interface JobCollectService {
    //根据ID删除职位收藏表记录
    public int deleteById(String id);

    //添加收藏职位
    public int insertJobCollect(JobCollect jobCollect);

    //分页查询 start,length
    public List<JobCollect> selectJobCollectListByTerms(Map<String,Object> map);

    //记录数
    public int selectJobCollectListCount(Map<String,Object> map);
}
