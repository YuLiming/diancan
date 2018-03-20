package com.ylm.service;

import com.ylm.pojo.DcFood;
import com.ylm.pojo.DcFoodExample;

import java.util.List;

public interface DcFoodService {

    /**
     * 获取所有菜品
     * @param example
     * @return
     */
    List<DcFood> selectByExample(DcFoodExample example);

    /**
     * 根据id获取菜品信息
     * @param foodId
     * @return
     */
    DcFood selectByPrimaryKey(Integer foodId);

    /**
     * 根据id批量获取菜品信息
     * @param foodIds
     * @return
     */
    List<DcFood> selectByPrimaryKeys(List<Integer> foodIds);

    /**
     * 更新菜品
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcFood record);

    /**
     * 根据id删除菜品
     * @param foodId
     * @return
     */
    int deleteByPrimaryKey(Integer foodId);

    /**
     * 新增菜品
     * @param record
     * @return
     */
    int insert(DcFood record);

    /**
     * 批量删除菜品
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);
}
