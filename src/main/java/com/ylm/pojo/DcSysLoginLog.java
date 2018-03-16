package com.ylm.pojo;

import java.util.Date;

public class DcSysLoginLog {
    private Integer llId;

    private Date llLoginDate;

    private String llIp;

    private String llReqUrl;

    public Integer getLlId() {
        return llId;
    }

    public void setLlId(Integer llId) {
        this.llId = llId;
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

    public String getLlReqUrl() {
        return llReqUrl;
    }

    public void setLlReqUrl(String llReqUrl) {
        this.llReqUrl = llReqUrl == null ? null : llReqUrl.trim();
    }
}