package com.ylm.pojo;

import java.util.Date;

public class DcCoupon {
    private String couponId;

    private Integer consumptionAmount;

    private Integer discount;

    private Date expiryTime;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Integer getConsumptionAmount() {
        return consumptionAmount;
    }

    public void setConsumptionAmount(Integer consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }
}