package com.duomiao.service;

import java.util.List;
import java.util.Map;

import com.duomiao.entity.InternInfo;

public interface InternInfoService {
	//查询列表
	public List<InternInfo> getInternInfoList(Map<String,Object> qryMap);
	//批量删除
	public int batchDelInternInfos(List<Integer> ids);
	//修改,权限仅对用户自己开放
	public int updateInternInfoForOwn(InternInfo internInfo);
	//特殊更新,系统修改
	public int specialUpdateInternInfo(Map<String,Object> qryMap);
    //定时删除 无效账户 减轻数据库负担
	public int specialDelInternInfoByState();
	//注册
	public int registerInternInfo(InternInfo internInfo);
	//重名校验
	public int validateSameName(String loginName);
}
