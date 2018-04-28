package com.duomiao.service;

import com.duomiao.entity.EnterpriseInfo;
import com.duomiao.entity.JobCollect;

import java.util.List;
import java.util.Map;

public interface EnterpriseInfoService {
    //hr查看公司信息
   EnterpriseInfo selectByEntId(String id);

    //根据ID删除企业
    public int deleteEnterpriseInfoById(String id);

    //HR注册企业信息
    public int insertEnterpriseInfo(EnterpriseInfo enterpriseInfo);

    //管理员分页查看 start,length
   public List<EnterpriseInfo> selectEntInfoList(Map map);

    //查看总记录数
   public int selectEntInfoListCount(Map map);

    //hr修改公司信息
    int updateById(EnterpriseInfo enterpriseInfo);

}
