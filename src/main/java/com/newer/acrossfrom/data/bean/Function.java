package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Function {
    private BigDecimal functionId;

    private String functionCode;

    private String functionName;

    private Date functionCreationTime;

    private BigDecimal functionCreatedBy;

    private Date functionLastUpdateTime;

    private String funcurl;

    private BigDecimal parentId;

    private String functionIsStart;

    public BigDecimal getFunctionId() {
        return functionId;
    }

    public void setFunctionId(BigDecimal functionId) {
        this.functionId = functionId;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public Date getFunctionCreationTime() {
        return functionCreationTime;
    }

    public void setFunctionCreationTime(Date functionCreationTime) {
        this.functionCreationTime = functionCreationTime;
    }

    public BigDecimal getFunctionCreatedBy() {
        return functionCreatedBy;
    }

    public void setFunctionCreatedBy(BigDecimal functionCreatedBy) {
        this.functionCreatedBy = functionCreatedBy;
    }

    public Date getFunctionLastUpdateTime() {
        return functionLastUpdateTime;
    }

    public void setFunctionLastUpdateTime(Date functionLastUpdateTime) {
        this.functionLastUpdateTime = functionLastUpdateTime;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl == null ? null : funcurl.trim();
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public String getFunctionIsStart() {
        return functionIsStart;
    }

    public void setFunctionIsStart(String functionIsStart) {
        this.functionIsStart = functionIsStart == null ? null : functionIsStart.trim();
    }
}