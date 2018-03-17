package com.ylm.service;

import com.ylm.mapper.DcFoodMapper;
import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcFoodExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcFoodServiceImpl implements DcFoodService {

    @Autowired
    DcFoodMapper dcFoodMapper;

    @Override
    public List<DcFood> selectByExample(DcFoodExample example) {
        return dcFoodMapper.selectByExample(example);
    }

    @Override
    public DcFood selectByPrimaryKey(Integer foodId) {
        return dcFoodMapper.selectByPrimaryKey(foodId);
    }

    @Override
    public List<DcFood> selectByPrimaryKeys(List<Integer> foodIds) {
        return dcFoodMapper.selectByPrimaryKeys(foodIds);
    }

    @Override
    public int updateByPrimaryKey(DcFood record) {
        return dcFoodMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer foodId) {
        return dcFoodMapper.deleteByPrimaryKey(foodId);
    }

    @Override
    public int insert(DcFood record) {
        return dcFoodMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return dcFoodMapper.deleteByPrimaryKeys(data);
    }
}
