package com.ylm.service;

import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderExample;

import java.util.List;

public interface DcOrderService {

    /**
     * 获取所有订单信息
     * @param example
     * @return
     */
    List<DcOrder> selectByExample(DcOrderExample example);

    /**
     * 新增订单
     * @param record
     * @return
     */
    int insert(DcOrder record);

    /**
     * 根据id删除订单
     * @param orderId
     * @return
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * 更新订单
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcOrder record);

    /**
     * 根据id获取订单信息
     * @param orderId
     * @return
     */
    DcOrder selectByPrimaryKey(String orderId);

    /**
     * 批量删除订单
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);

    /**
     * 根据时间段获取订单信息
     * @param startTime
     * @param endTime
     * @return
     */
    List<DcOrder> selectOrderNum(String startTime,String endTime);

    /**
     * 根据id更新订单详情
     * @param orderId
     * @param foodIds
     * @param foodNum
     * @return
     */
    int updateOrderDetailByPrimaryKey(String orderId,String foodIds,String foodNum);

}
