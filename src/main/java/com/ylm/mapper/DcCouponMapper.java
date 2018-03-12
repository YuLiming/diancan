package com.ylm.mapper;

import com.ylm.pojo.DcCoupon;
import com.ylm.pojo.DcCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcCouponMapper {
    int countByExample(DcCouponExample example);

    int deleteByExample(DcCouponExample example);

    int deleteByPrimaryKey(String couponId);

    int insert(DcCoupon record);

    int insertSelective(DcCoupon record);

    List<DcCoupon> selectByExample(DcCouponExample example);

    DcCoupon selectByPrimaryKey(String couponId);

    int updateByExampleSelective(@Param("record") DcCoupon record, @Param("example") DcCouponExample example);

    int updateByExample(@Param("record") DcCoupon record, @Param("example") DcCouponExample example);

    int updateByPrimaryKeySelective(DcCoupon record);

    int updateByPrimaryKey(DcCoupon record);
}