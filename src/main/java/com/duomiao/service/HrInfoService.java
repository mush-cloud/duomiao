package com.duomiao.service;

import com.duomiao.entity.HrInfo;
import java.util.List;
import java.util.Map;

public interface HrInfoService {
	List<HrInfo> selectHrInfoList(Map map);

	int selectHrInfoListCount(Map map);

	int insertHrInfo(HrInfo hrInfo);

	HrInfo selectMyHrInfo(HrInfo hrInfo);

	int updateMyHrInfo(Map map);

	int deleteHrById(String id);

	int validateSameName(String hrName);
}
