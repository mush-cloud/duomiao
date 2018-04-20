package com.duomiao.service.impl;

import com.duomiao.entity.PositionCategory;
import com.duomiao.mapper.PositionCategoryMapper;
import com.duomiao.service.PositionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PositionCategoryServiceImpl implements PositionCategoryService {
    @Autowired
    private PositionCategoryMapper positionCategoryMapper;
    @Override
    public PositionCategory selectById(String id) {
        return positionCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertCategory(PositionCategory positionCategory) {
        return positionCategoryMapper.insertCategory(positionCategory);
    }

    @Override
    public int deleteById(String id) {
        return positionCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByFatherId(String id) {
        return positionCategoryMapper.deleteByFatherId(id);
    }

    @Override
    public List<PositionCategory> selectByFatherId(String id) {
        return positionCategoryMapper.selectByFatherId(id);
    }

    @Override
    public int updateById(Map map) {
        return positionCategoryMapper.updateById(map);
    }

    @Override
    public List<PositionCategory> selectBaseKinds() {
        return positionCategoryMapper.selectBaseKinds();
    }
}
