package com.duomiao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duomiao.entity.InternInfo;
import com.duomiao.mapper.InternInfoMapper;
import com.duomiao.service.InternInfoService;
@Service
public class InternInfoServiceImpl implements InternInfoService{
	@Autowired
    private InternInfoMapper internInfoMapper;
	//查询
	@Override
	public List<InternInfo> getInternInfoList(Map<String, Object> qryMap) {
		return internInfoMapper.selectInternInfoList(qryMap);

	}
 //批量删除
	@Override
	public int batchDelInternInfos(List<Integer> ids) {
	return internInfoMapper.batchDelInternInfos(ids);
	}
//自我更新
	@Override
	public int updateInternInfoForOwn(InternInfo internInfo) {
		return internInfoMapper.updateInternInfoForOwn(internInfo);
	}
//系统自动更新
	@Override
	public int specialUpdateInternInfo(Map<String, Object> qryMap) {
		return internInfoMapper.specialUpdateInternInfo(qryMap);
	}
//定时删除无效账户，减轻数据库负载
	@Override
	public int specialDelInternInfoByState() {
		return internInfoMapper.specialDelInternInfoByState();
	}
//注册
	@Override
	public int registerInternInfo(InternInfo internInfo) {
		return internInfoMapper.register(internInfo);
	}
//重名校验
	@Override
	public int validateSameName(String loginName) {
	return internInfoMapper.sameName(loginName);
	}

}
