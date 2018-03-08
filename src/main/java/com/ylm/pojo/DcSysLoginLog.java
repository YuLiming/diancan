package com.ylm.pojo;

import java.util.Date;

public class DcSysLoginLog {
    private Integer llId;

    private Integer adminId;

    private Date llLoginDate;

    private String llIp;

    private Integer llStatus;

    public Integer getLlId() {
        return llId;
    }

    public void setLlId(Integer llId) {
        this.llId = llId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getLlLoginDate() {
        return llLoginDate;
    }

    public void setLlLoginDate(Date llLoginDate) {
        this.llLoginDate = llLoginDate;
    }

    public String getLlIp() {
        return llIp;
    }

    public void setLlIp(String llIp) {
        this.llIp = llIp == null ? null : llIp.trim();
    }

    public Integer getLlStatus() {
        return llStatus;
    }

    public void setLlStatus(Integer llStatus) {
        this.llStatus = llStatus;
    }
}