package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Inspector {
    private BigDecimal inspectorId;

    private BigDecimal inspectorTaskId;

    private BigDecimal inspectorCode;

    private String inspectorName;

    private Date inspectorCreationTime;

    private String inspectorCreatedBy;

    private Date inspectorLastUpdateTime;

    public BigDecimal getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(BigDecimal inspectorId) {
        this.inspectorId = inspectorId;
    }

    public BigDecimal getInspectorTaskId() {
        return inspectorTaskId;
    }

    public void setInspectorTaskId(BigDecimal inspectorTaskId) {
        this.inspectorTaskId = inspectorTaskId;
    }

    public BigDecimal getInspectorCode() {
        return inspectorCode;
    }

    public void setInspectorCode(BigDecimal inspectorCode) {
        this.inspectorCode = inspectorCode;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName == null ? null : inspectorName.trim();
    }

    public Date getInspectorCreationTime() {
        return inspectorCreationTime;
    }

    public void setInspectorCreationTime(Date inspectorCreationTime) {
        this.inspectorCreationTime = inspectorCreationTime;
    }

    public String getInspectorCreatedBy() {
        return inspectorCreatedBy;
    }

    public void setInspectorCreatedBy(String inspectorCreatedBy) {
        this.inspectorCreatedBy = inspectorCreatedBy == null ? null : inspectorCreatedBy.trim();
    }

    public Date getInspectorLastUpdateTime() {
        return inspectorLastUpdateTime;
    }

    public void setInspectorLastUpdateTime(Date inspectorLastUpdateTime) {
        this.inspectorLastUpdateTime = inspectorLastUpdateTime;
    }
}