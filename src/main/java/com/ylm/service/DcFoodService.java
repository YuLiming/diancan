package com.ylm.service;

import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcFoodExample;

import java.util.List;

public interface DcFoodService {
    List<DcFood> selectByExample(DcFoodExample example);

    DcFood selectByPrimaryKey(Integer foodId);

    List<DcFood> selectByPrimaryKeys(List<String> foodIds);

    int updateByPrimaryKey(DcFood record);

    int deleteByPrimaryKey(Integer foodId);

    int insert(DcFood record);

    int deleteByPrimaryKeys(List<Integer> data);
}
