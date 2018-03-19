package com.ylm.pojo;

import java.util.Date;

public class DcSysOperateLog {
    private Integer olId;

    private String olType;

    private String olModule;

    private String olContent;

    private Integer adminId;

    private String olAddDate;

    private String olIp;

    private String olRemarks;

    public Integer getOlId() {
        return olId;
    }

    public void setOlId(Integer olId) {
        this.olId = olId;
    }

    public String getOlType() {
        return olType;
    }

    public void setOlType(String olType) {
        this.olType = olType == null ? null : olType.trim();
    }

    public String getOlModule() {
        return olModule;
    }

    public void setOlModule(String olModule) {
        this.olModule = olModule == null ? null : olModule.trim();
    }

    public String getOlContent() {
        return olContent;
    }

    public void setOlContent(String olContent) {
        this.olContent = olContent == null ? null : olContent.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getOlAddDate() {
        return olAddDate;
    }

    public void setOlAddDate(String olAddDate) {
        this.olAddDate = olAddDate;
    }

    public String getOlIp() {
        return olIp;
    }

    public void setOlIp(String olIp) {
        this.olIp = olIp == null ? null : olIp.trim();
    }

    public String getOlRemarks() {
        return olRemarks;
    }

    public void setOlRemarks(String olRemarks) {
        this.olRemarks = olRemarks == null ? null : olRemarks.trim();
    }
}