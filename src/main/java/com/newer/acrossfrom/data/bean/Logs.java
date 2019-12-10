package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Logs {
    private BigDecimal logsId;

    private BigDecimal logsUserId;

    private String operateInfo;

    private Date operateDatetime;

    public BigDecimal getLogsId() {
        return logsId;
    }

    public void setLogsId(BigDecimal logsId) {
        this.logsId = logsId;
    }

    public BigDecimal getLogsUserId() {
        return logsUserId;
    }

    public void setLogsUserId(BigDecimal logsUserId) {
        this.logsUserId = logsUserId;
    }

    public String getOperateInfo() {
        return operateInfo;
    }

    public void setOperateInfo(String operateInfo) {
        this.operateInfo = operateInfo == null ? null : operateInfo.trim();
    }

    public Date getOperateDatetime() {
        return operateDatetime;
    }

    public void setOperateDatetime(Date operateDatetime) {
        this.operateDatetime = operateDatetime;
    }
}