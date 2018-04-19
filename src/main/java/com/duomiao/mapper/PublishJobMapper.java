package com.duomiao.mapper;

import com.duomiao.entity.PublishJob;
import com.duomiao.entity.PublishJobExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PublishJobMapper {
    long countByExample(PublishJobExample example);

    int deleteByExample(PublishJobExample example);
//删除职位（HR管理）
    int deleteByPrimaryKey(String id);

    int insert(PublishJob record);

    int insertSelective(PublishJob record);

    List<PublishJob> selectByExampleWithBLOBs(PublishJobExample example);

    List<PublishJob> selectByExample(PublishJobExample example);

    PublishJob selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByExampleWithBLOBs(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByExample(@Param("record") PublishJob record, @Param("example") PublishJobExample example);

    int updateByPrimaryKeySelective(PublishJob record);

    int updateByPrimaryKeyWithBLOBs(PublishJob record);

    int updateByPrimaryKey(PublishJob record);
//HR查看自己所发布的职位信息|前端分页/没有条件查询
    List<PublishJob> selectMyPubJobs(Map map);
    //发布职位
    int insertPubJob(PublishJob publishJob);
    //hr自己修改职位,或投递简历时系统自动更新send数量
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
   List<PublishJob> selectPubJobById(String id);
   //<!--热门职位搜索 8个固定-->
   List<PublishJob> selectHotPubJob();
   //<!--最新职位展示 8个固定-->
   List<PublishJob> selectNewPubJob();

}