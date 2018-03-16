package com.ylm.service;

import com.ylm.mapper.DcCouponMapper;
import com.ylm.pojo.DcCoupon;
import com.ylm.pojo.DcCouponExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DcCouponServiceImpl implements DcCouponService {

    @Autowired
    DcCouponMapper dcCouponMapper;

    @Override
    public int insert(DcCoupon record) {
        return dcCouponMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer couponId) {
        return dcCouponMapper.deleteByPrimaryKey(couponId);
    }

    @Override
    public int updateByPrimaryKey(DcCoupon record) {
        return dcCouponMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<DcCoupon> selectByExample(DcCouponExample example) {
        return dcCouponMapper.selectByExample(example);
    }

    @Override
    public DcCoupon selectByPrimaryKey(Integer couponId) {
        return dcCouponMapper.selectByPrimaryKey(couponId);
    }

    @Override
    public int deleteByPrimaryKeys(List<Integer> data) {
        return dcCouponMapper.deleteByPrimaryKeys(data);
    }
}
