package com.newer.acrossfrom.data.bean;

import java.util.Date;

public class PoleInfo {
    private Integer poleid;
    private String poleCode;
    private Date poleCreationTime;
    private String poleCreatedBy;
    private Date poleLastUpdateTime;
    private String poleIsStart;

    public PoleInfo() {
    }

    public PoleInfo(Integer poleid, String poleCode, Date poleCreationTime, String poleCreatedBy, Date poleLastUpdateTime, String poleIsStart) {
        this.poleid = poleid;
        this.poleCode = poleCode;
        this.poleCreationTime = poleCreationTime;
        this.poleCreatedBy = poleCreatedBy;
        this.poleLastUpdateTime = poleLastUpdateTime;
        this.poleIsStart = poleIsStart;
    }

    public Integer getPoleid() {
        return poleid;
    }

    public void setPoleid(Integer poleid) {
        this.poleid = poleid;
    }

    public String getPoleCode() {
        return poleCode;
    }

    public void setPoleCode(String poleCode) {
        this.poleCode = poleCode;
    }

    public Date getPoleCreationTime() {
        return poleCreationTime;
    }

    public void setPoleCreationTime(Date poleCreationTime) {
        this.poleCreationTime = poleCreationTime;
    }

    public String getPoleCreatedBy() {
        return poleCreatedBy;
    }

    public void setPoleCreatedBy(String poleCreatedBy) {
        this.poleCreatedBy = poleCreatedBy;
    }

    public Date getPoleLastUpdateTime() {
        return poleLastUpdateTime;
    }

    public void setPoleLastUpdateTime(Date poleLastUpdateTime) {
        this.poleLastUpdateTime = poleLastUpdateTime;
    }

    public String getPoleIsStart() {
        return poleIsStart;
    }

    public void setPoleIsStart(String poleIsStart) {
        this.poleIsStart = poleIsStart;
    }

    @Override
    public String toString() {
        return "PoleInfo{" +
                "poleid=" + poleid +
                ", poleCode='" + poleCode + '\'' +
                ", poleCreationTime=" + poleCreationTime +
                ", poleCreatedBy='" + poleCreatedBy + '\'' +
                ", poleLastUpdateTime=" + poleLastUpdateTime +
                ", poleIsStart='" + poleIsStart + '\'' +
                '}';
    }
}