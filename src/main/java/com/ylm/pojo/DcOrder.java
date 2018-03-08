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

    private Integer orderStatus;

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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}