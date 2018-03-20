package com.ylm.service;

import com.ylm.pojo.DcFoodtype;
import com.ylm.pojo.DcFoodtypeExample;

import java.util.List;

public interface DcFoodTypeService {

    /**
     * 获取所有菜系
     * @param example
     * @return
     */
    List<DcFoodtype> selectByExample(DcFoodtypeExample example);

    /**
     * 根据id获取菜系
     * @param foodtypeId
     * @return
     */
    DcFoodtype selectByPrimaryKey(Integer foodtypeId);

    /**
     * 更新菜系
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcFoodtype record);

    /**
     * 新增菜系
     * @param record
     * @return
     */
    int insert(DcFoodtype record);

    /**
     * 根据id删除菜系
     * @param foodtypeId
     * @return
     */
    int deleteByPrimaryKey(Integer foodtypeId);

    /**
     * 批量删除菜系
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);

}
