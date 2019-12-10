package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Premission {
    private BigDecimal rpId;

    private BigDecimal rpRoleId;

    private BigDecimal rpFunctionId;

    private Date rpCreationTime;

    private BigDecimal rpCreatedBy;

    private Date rpLastUpdateTime;

    private String rpIsStart;

    public BigDecimal getRpId() {
        return rpId;
    }

    public void setRpId(BigDecimal rpId) {
        this.rpId = rpId;
    }

    public BigDecimal getRpRoleId() {
        return rpRoleId;
    }

    public void setRpRoleId(BigDecimal rpRoleId) {
        this.rpRoleId = rpRoleId;
    }

    public BigDecimal getRpFunctionId() {
        return rpFunctionId;
    }

    public void setRpFunctionId(BigDecimal rpFunctionId) {
        this.rpFunctionId = rpFunctionId;
    }

    public Date getRpCreationTime() {
        return rpCreationTime;
    }

    public void setRpCreationTime(Date rpCreationTime) {
        this.rpCreationTime = rpCreationTime;
    }

    public BigDecimal getRpCreatedBy() {
        return rpCreatedBy;
    }

    public void setRpCreatedBy(BigDecimal rpCreatedBy) {
        this.rpCreatedBy = rpCreatedBy;
    }

    public Date getRpLastUpdateTime() {
        return rpLastUpdateTime;
    }

    public void setRpLastUpdateTime(Date rpLastUpdateTime) {
        this.rpLastUpdateTime = rpLastUpdateTime;
    }

    public String getRpIsStart() {
        return rpIsStart;
    }

    public void setRpIsStart(String rpIsStart) {
        this.rpIsStart = rpIsStart == null ? null : rpIsStart.trim();
    }
}