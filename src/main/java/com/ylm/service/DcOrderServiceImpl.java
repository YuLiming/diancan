package com.ylm.service;

import com.ylm.mapper.DcOrderMapper;
import com.ylm.pojo.DcOrder;
import com.ylm.pojo.DcOrderExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcOrderServiceImpl implements DcOrderService {

    @Autowired
    DcOrderMapper dcOrderMapper;

    @Override
    public List<DcOrder> selectByExample(DcOrderExample example) {
        return dcOrderMapper.selectByExample(example);
    }

    @Override
    public int insert(DcOrder record) {
        return dcOrderMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(String orderId) {
        return dcOrderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKey(DcOrder record) {
        return dcOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public DcOrder selectByPrimaryKey(String orderId) {
        return dcOrderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return dcOrderMapper.deleteByPrimaryKeys(data);
    }

    @Override
    public List<DcOrder> selectOrderNum(String startTime, String endTime) {
        return dcOrderMapper.selectOrderNum(startTime, endTime);
    }

    @Override
    public int updateOrderDetailByPrimaryKey(String orderId, String foodIds, String foodNum) {
        return dcOrderMapper.updateOrderDetailByPrimaryKey(orderId, foodIds, foodNum);
    }
}
