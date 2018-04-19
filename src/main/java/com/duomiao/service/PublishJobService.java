package com.duomiao.service;

import com.duomiao.entity.PublishJob;

import java.util.List;
import java.util.Map;

public interface PublishJobService {
    //根据ID删除已发布职位
    public int deleteById(String id);

    //HR查看自己所发布的职位信息|前端分页/没有条件查询
    List<PublishJob> selectMyPubJobs(Map map);
    //发布职位
    int insertPubJob(PublishJob publishJob);
    //hr自己修改职位,或投递简历时系统自动更新send数量 sendnum+1
    int updateMyPubJobById(Map map);
    //过期职位数据清除，定时删除
    int deleteAutoTimeout();
    //一级类别查询,map键 arrId,start,length
    List<PublishJob> selectPublicMethodOne(Map map);
    //二级类别查询,主搜索框查询-
    List<PublishJob> selectPublicMethodTwo(Map map);
    //主搜索框总记录数
    int selectPublicMethodTwoCount(Map map);
    //获取某一职位具体信息-
    PublishJob selectPubJobById(String id);
    //<!--热门职位搜索 8个固定-->
    List<PublishJob> selectHotPubJob();
    //<!--最新职位展示 8个固定-->
    List<PublishJob> selectNewPubJob();
}
