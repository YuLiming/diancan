package com.ylm.pojo;

public class DcUser {
    private String userId;

    private String userName;

    private String userPhone;

    private Integer accumulatePoints;

    private Integer balance;

    private String memberLevel;

    private Integer userIsDel;

    private String userPassword;

    private String userCoupon;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getAccumulatePoints() {
        return accumulatePoints;
    }

    public void setAccumulatePoints(Integer accumulatePoints) {
        this.accumulatePoints = accumulatePoints;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel == null ? null : memberLevel.trim();
    }

    public Integer getUserIsDel() {
        return userIsDel;
    }

    public void setUserIsDel(Integer userIsDel) {
        this.userIsDel = userIsDel;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserCoupon() {
        return userCoupon;
    }

    public void setUserCoupon(String userCoupon) {
        this.userCoupon = userCoupon == null ? null : userCoupon.trim();
    }
}