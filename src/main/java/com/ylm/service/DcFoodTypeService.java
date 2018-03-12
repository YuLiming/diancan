package com.ylm.service;

import com.ylm.pojo.DcFoodtype;
import com.ylm.pojo.DcFoodtypeExample;

import java.util.List;

public interface DcFoodTypeService {

    List<DcFoodtype> selectByExample(DcFoodtypeExample example);

    DcFoodtype selectByPrimaryKey(Integer foodtypeId);

    int updateByPrimaryKey(DcFoodtype record);

    int insert(DcFoodtype record);

    int deleteByPrimaryKey(Integer foodtypeId);

}
