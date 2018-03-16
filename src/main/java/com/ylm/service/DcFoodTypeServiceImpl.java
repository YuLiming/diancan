package com.ylm.service;

import com.ylm.mapper.DcFoodtypeMapper;
import com.ylm.pojo.DcFoodtype;
import com.ylm.pojo.DcFoodtypeExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcFoodTypeServiceImpl implements DcFoodTypeService {
    @Autowired
    DcFoodtypeMapper dcFoodtypeMapper;
    @Override
    public List<DcFoodtype> selectByExample(DcFoodtypeExample example) {
        return dcFoodtypeMapper.selectByExample(example);
    }

    @Override
    public DcFoodtype selectByPrimaryKey(Integer foodtypeId) {
        return dcFoodtypeMapper.selectByPrimaryKey(foodtypeId);
    }

    @Override
    public int updateByPrimaryKey(DcFoodtype record) {
        return dcFoodtypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(DcFoodtype record) {
        return dcFoodtypeMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer foodtypeId) {
        return dcFoodtypeMapper.deleteByPrimaryKey(foodtypeId);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return dcFoodtypeMapper.deleteByPrimaryKeys(data);
    }
}
