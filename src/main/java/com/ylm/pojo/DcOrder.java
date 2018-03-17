package com.ylm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DcOrder {
    private String orderId;

    private Integer boardId;

    private Integer orderPeopleNumber;

    private String orderDate;

    private String orderBoardDate;

    private String orderBoardTimeInterval;

    private BigDecimal orderTotalAmount;

    private String orderStatus;

    private String userId;

    private String couponId;

    private String orderFood;

    private String orderFoodNum;

    private BigDecimal orderDiscountAmount;

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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderBoardDate() {
        return orderBoardDate;
    }

    public void setOrderBoardDate(String orderBoardDate) {
        this.orderBoardDate = orderBoardDate;
    }

    public String getOrderBoardTimeInterval() {
        return orderBoardTimeInterval;
    }

    public void setOrderBoardTimeInterval(String orderBoardTimeInterval) {
        this.orderBoardTimeInterval = orderBoardTimeInterval == null ? null : orderBoardTimeInterval.trim();
    }

    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
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

    public BigDecimal getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(BigDecimal orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }
}