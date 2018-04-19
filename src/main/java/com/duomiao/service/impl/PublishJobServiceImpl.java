package com.duomiao.service.impl;

import com.duomiao.entity.PublishJob;
import com.duomiao.mapper.PublishJobMapper;
import com.duomiao.service.PublishJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PublishJobServiceImpl implements PublishJobService{
    @Autowired
    private PublishJobMapper publishJobMapper;
    @Override
    public int deleteById(String id) {
        return publishJobMapper.deleteByPrimaryKey(id);
    }
    //HR查看自己所发布的职位信息|前端分页/没有条件查询 参数entId（公司ID查询）无其他条件
    @Override
    public List<PublishJob> selectMyPubJobs(Map map) {
        return publishJobMapper.selectMyPubJobs(map);
    }

    @Override
    public int insertPubJob(PublishJob publishJob) {
        return publishJobMapper.insertPubJob(publishJob);
    }
//HR修改更新已发布职位,参数很多
    @Override
    public int updateMyPubJobById(Map map) {
        return publishJobMapper.updateMyPubJobById(map);
    }
//定时执行,定时器执行
    @Override
    public int deleteAutoTimeout() {
        return publishJobMapper.deleteAutoTimeout();
    }
//一级查询
    @Override
    public List<PublishJob> selectPublicMethodOne(Map map) {
        return publishJobMapper.selectPublicMethodOne(map);
    }

    @Override
    public List<PublishJob> selectPublicMethodTwo(Map map) {
        return publishJobMapper.selectPublicMethodTwo(map);
    }

    @Override
    public int selectPublicMethodTwoCount(Map map) {
        return publishJobMapper.selectPublicMethodTwoCount(map);
    }

    //进入职位详情
    @Override
    public PublishJob selectPubJobById(String id) {
        return publishJobMapper.selectPubJobById(id).get(0);
    }
//8个热门职位
    @Override
    public List<PublishJob> selectHotPubJob() {
        return publishJobMapper.selectHotPubJob();
    }
//8个最新职位
    @Override
    public List<PublishJob> selectNewPubJob() {
        return publishJobMapper.selectNewPubJob();
    }
}
