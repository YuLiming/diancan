package com.ylm.service;

import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderExample;

import java.util.List;

public interface DcOrderService {

    List<DcOrder> selectByExample(DcOrderExample example);

    int insert(DcOrder record);

    int deleteByPrimaryKey(String orderId);

    int updateByPrimaryKey(DcOrder record);

    DcOrder selectByPrimaryKey(String orderId);

    int deleteByPrimaryKeys(List<Integer> data);

    List<DcOrder> selectOrderNum(String startTime,String endTime);

    int updateOrderDetailByPrimaryKey(String orderId,String foodIds,String foodNum);

}
