package com.duomiao.mapper;

import com.duomiao.entity.EntResume;
import com.duomiao.entity.EntResumeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EntResumeMapper {
    long countByExample(EntResumeExample example);

    int deleteByExample(EntResumeExample example);

    int deleteByPrimaryKey(String id);

    int insert(EntResume record);

    int insertSelective(EntResume record);

    List<EntResume> selectByExample(EntResumeExample example);

    EntResume selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EntResume record, @Param("example") EntResumeExample example);

    int updateByExample(@Param("record") EntResume record, @Param("example") EntResumeExample example);

    int updateByPrimaryKeySelective(EntResume record);

    int updateByPrimaryKey(EntResume record);
    //<!--假删除 设置状态值为1  -->
    int updateForFakeDel(Map map);
    //恢复删除的文件
    int recoverEntResumeById(String id);
    //查询有效企业&简历
    List<EntResume>  selectByMap(Map map);
    //查询无效企业&简历
    List<EntResume>  selectDelData();
    //投递简历时--插入记录信息-->
    int insertEntResume(Map map);
    //系统定时删除无效数据 状态为1
    int deleteInvalidData();
    //总记录数
    int getTotal(Map map);
 }