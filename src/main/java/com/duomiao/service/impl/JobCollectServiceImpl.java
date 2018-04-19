package com.duomiao.service.impl;

import com.duomiao.entity.JobCollect;
import com.duomiao.mapper.JobCollectMapper;
import com.duomiao.service.JobCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class JobCollectServiceImpl implements JobCollectService {
    @Autowired
    private JobCollectMapper jobCollectMapper;
    //删除
    @Override
    public int deleteById(String id) {
     return  jobCollectMapper.deleteByPrimaryKey(id);
    }
    //插入
    @Override
    public int insertJobCollect(JobCollect jobCollect) {
        return jobCollectMapper.insertJobCollect(jobCollect);
    }
   //分页查询
    @Override
    public List<JobCollect> selectJobCollectListByTerms(Map<String, Object> map) {
        return jobCollectMapper.selectJobCollectListByTerms(map);
    }

    @Override
    public int selectJobCollectListCount(Map<String, Object> map) {
        return jobCollectMapper.selectJobCollectListCount(map);
    }
}
