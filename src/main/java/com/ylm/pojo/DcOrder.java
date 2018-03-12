package com.ylm.pojo;

import java.util.Date;

public class DcOrder {
    private String orderId;

    private Integer boardId;

    private Integer orderPeopleNumber;

    private Date orderDate;

    private Date orderBoardDate;

    private String orderBoardTimeInterval;

    private Integer orderTotalAmount;

    private String orderStatus;

    private String userId;

    private String couponId;

    private String orderFood;

    private String orderFoodNum;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getOrderPeopleNumber() {
        return orderPeopleNumber;
    }

    public void setOrderPeopleNumber(Integer orderPeopleNumber) {
        this.orderPeopleNumber = orderPeopleNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderBoardDate() {
        return orderBoardDate;
    }

    public void setOrderBoardDate(Date orderBoardDate) {
        this.orderBoardDate = orderBoardDate;
    }

    public String getOrderBoardTimeInterval() {
        return orderBoardTimeInterval;
    }

    public void setOrderBoardTimeInterval(String orderBoardTimeInterval) {
        this.orderBoardTimeInterval = orderBoardTimeInterval == null ? null : orderBoardTimeInterval.trim();
    }

    public Integer getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(Integer orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getOrderFood() {
        return orderFood;
    }

    public void setOrderFood(String orderFood) {
        this.orderFood = orderFood == null ? null : orderFood.trim();
    }

    public String getOrderFoodNum() {
        return orderFoodNum;
    }

    public void setOrderFoodNum(String orderFoodNum) {
        this.orderFoodNum = orderFoodNum == null ? null : orderFoodNum.trim();
    }
}