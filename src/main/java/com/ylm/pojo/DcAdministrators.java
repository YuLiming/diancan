package com.ylm.pojo;

public class DcAdministrators {
    private Integer adminId;

    private String adminAccount;

    private String adminPassword;

    private Integer adminRights;

    private Integer adminIsdel;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminRights() {
        return adminRights;
    }

    public void setAdminRights(Integer adminRights) {
        this.adminRights = adminRights;
    }

    public Integer getAdminIsdel() {
        return adminIsdel;
    }

    public void setAdminIsdel(Integer adminIsdel) {
        this.adminIsdel = adminIsdel;
    }
}