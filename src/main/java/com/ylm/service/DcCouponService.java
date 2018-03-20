package com.ylm.service;

import com.ylm.pojo.DcCoupon;
import com.ylm.pojo.DcCouponExample;

import java.util.List;

public interface DcCouponService {

    /**
     * 插入卡券信息
     * @param record
     * @return
     */
    int insert(DcCoupon record);

    /**
     * 根据id删除卡券
     * @param couponId
     * @return
     */
    int deleteByPrimaryKey(Integer couponId);

    /**
     * 更新卡券信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(DcCoupon record);

    /**
     * 获取所有卡券信息
     * @param example
     * @return
     */
    List<DcCoupon> selectByExample(DcCouponExample example);

    /**
     * 根据id获取卡券信息
     * @param couponId
     * @return
     */
    DcCoupon selectByPrimaryKey(Integer couponId);

    /**
     * 批量删除卡券
     * @param data
     * @return
     */
    int deleteByPrimaryKeys(List<Integer> data);
}
