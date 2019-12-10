package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Solvetask {
    private BigDecimal stId;

    private BigDecimal stTaskId;

    private BigDecimal inspectionTaskDelId;

    private Date stCreationTime;

    private String stCreatedBy;

    private Date stLastupdateTime;

    public BigDecimal getStId() {
        return stId;
    }

    public void setStId(BigDecimal stId) {
        this.stId = stId;
    }

    public BigDecimal getStTaskId() {
        return stTaskId;
    }

    public void setStTaskId(BigDecimal stTaskId) {
        this.stTaskId = stTaskId;
    }

    public BigDecimal getInspectionTaskDelId() {
        return inspectionTaskDelId;
    }

    public void setInspectionTaskDelId(BigDecimal inspectionTaskDelId) {
        this.inspectionTaskDelId = inspectionTaskDelId;
    }

    public Date getStCreationTime() {
        return stCreationTime;
    }

    public void setStCreationTime(Date stCreationTime) {
        this.stCreationTime = stCreationTime;
    }

    public String getStCreatedBy() {
        return stCreatedBy;
    }

    public void setStCreatedBy(String stCreatedBy) {
        this.stCreatedBy = stCreatedBy == null ? null : stCreatedBy.trim();
    }

    public Date getStLastupdateTime() {
        return stLastupdateTime;
    }

    public void setStLastupdateTime(Date stLastupdateTime) {
        this.stLastupdateTime = stLastupdateTime;
    }
}