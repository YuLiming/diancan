package com.ylm.service;

import com.ylm.pojo.DcCoupon;
import com.ylm.pojo.DcCouponExample;

import java.util.List;

public interface DcCouponService {

    int insert(DcCoupon record);

    int deleteByPrimaryKey(Integer couponId);

    int updateByPrimaryKey(DcCoupon record);

    List<DcCoupon> selectByExample(DcCouponExample example);

    DcCoupon selectByPrimaryKey(Integer couponId);

    int deleteByPrimaryKeys(List<Integer> data);
}
