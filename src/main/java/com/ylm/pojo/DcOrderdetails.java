package com.ylm.pojo;

public class DcOrderdetails {
    private Integer orderdetailsId;

    private Integer orderId;

    private Integer foodId;

    private Integer foodNum;

    public Integer getOrderdetailsId() {
        return orderdetailsId;
    }

    public void setOrderdetailsId(Integer orderdetailsId) {
        this.orderdetailsId = orderdetailsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(Integer foodNum) {
        this.foodNum = foodNum;
    }
}