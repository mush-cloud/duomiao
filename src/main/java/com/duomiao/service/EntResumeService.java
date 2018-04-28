package com.duomiao.service;


import com.duomiao.entity.EntResume;

import java.util.List;
import java.util.Map;

public interface EntResumeService {
    //<!--假删除 设置状态值为1  -->
    int updateForFakeDel(Map map);
    //恢复删除的文件
    int recoverEntResumeById(String id);
    //查询有效简历
    List<EntResume> selectByMap(Map map);
    //查询无效简历
    List<EntResume>  selectDelData();
    //投递简历时--插入记录信息-->
    int insertEntResume(Map map);
    //系统定时删除无效数据 状态为1
    int deleteInvalidData();
    //获取总记录数
    int getTotal(Map map);
    int checkSend(Map map);

}
