package com.ylm.pojo;

import java.util.Date;

public class DcCoupon {
    private Integer couponId;

    private Integer consumptionAmount;

    private Integer discount;

    private Date expiryTime;

    private String remark;

    private Integer couponIsdel;

    private Date startTime;

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

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}