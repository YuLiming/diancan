package com.ylm.pojo;

import java.util.Date;

public class DcCoupon {
    private Integer couponId;

    private Integer consumptionAmount;

    private Integer discount;

    private String expiryTime;

    private String remark;

    private Integer couponIsdel;

    private String startTime;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
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

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCouponIsdel() {
        return couponIsdel;
    }

    public void setCouponIsdel(Integer couponIsdel) {
        this.couponIsdel = couponIsdel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}