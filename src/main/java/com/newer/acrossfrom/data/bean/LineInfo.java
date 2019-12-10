package com.newer.acrossfrom.data.bean;

import java.util.Date;

public class LineInfo {
    private Integer lineId;
    private String lineCode;
    private String lineName;
    private Integer lineLength;
    private Integer backLength;
    private Date productDate;
    private Integer voltageLevel;
    private Integer lineStartPole;
    private Integer lineEndPole;
    private Integer towerBaseNum;
    private String maintenanceCompany;
    private Integer runningSysId;
    private String common;
    private Date lineCreationTime;
    private Integer lineCreatedId;
    private Date lineLastUpdateTime;
    private String lineIsStart;

    public LineInfo() {
    }

    public LineInfo(Integer lineId, String lineCode, String lineName, Integer lineLength, Integer backLength, Date productDate, Integer voltageLevel, Integer lineStartPole, Integer lineEndPole, Integer towerBaseNum, String maintenanceCompany, Integer runningSysId, String common, Date lineCreationTime, Integer lineCreatedId, Date lineLastUpdateTime, String lineIsStart) {
        this.lineId = lineId;
        this.lineCode = lineCode;
        this.lineName = lineName;
        this.lineLength = lineLength;
        this.backLength = backLength;
        this.productDate = productDate;
        this.voltageLevel = voltageLevel;
        this.lineStartPole = lineStartPole;
        this.lineEndPole = lineEndPole;
        this.towerBaseNum = towerBaseNum;
        this.maintenanceCompany = maintenanceCompany;
        this.runningSysId = runningSysId;
        this.common = common;
        this.lineCreationTime = lineCreationTime;
        this.lineCreatedId = lineCreatedId;
        this.lineLastUpdateTime = lineLastUpdateTime;
        this.lineIsStart = lineIsStart;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Integer getLineLength() {
        return lineLength;
    }

    public void setLineLength(Integer lineLength) {
        this.lineLength = lineLength;
    }

    public Integer getBackLength() {
        return backLength;
    }

    public void setBackLength(Integer backLength) {
        this.backLength = backLength;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Integer getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(Integer voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public Integer getLineStartPole() {
        return lineStartPole;
    }

    public void setLineStartPole(Integer lineStartPole) {
        this.lineStartPole = lineStartPole;
    }

    public Integer getLineEndPole() {
        return lineEndPole;
    }

    public void setLineEndPole(Integer lineEndPole) {
        this.lineEndPole = lineEndPole;
    }

    public Integer getTowerBaseNum() {
        return towerBaseNum;
    }

    public void setTowerBaseNum(Integer towerBaseNum) {
        this.towerBaseNum = towerBaseNum;
    }

    public String getMaintenanceCompany() {
        return maintenanceCompany;
    }

    public void setMaintenanceCompany(String maintenanceCompany) {
        this.maintenanceCompany = maintenanceCompany;
    }

    public Integer getRunningSysId() {
        return runningSysId;
    }

    public void setRunningSysId(Integer runningSysId) {
        this.runningSysId = runningSysId;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public Date getLineCreationTime() {
        return lineCreationTime;
    }

    public void setLineCreationTime(Date lineCreationTime) {
        this.lineCreationTime = lineCreationTime;
    }

    public Integer getLineCreatedId() {
        return lineCreatedId;
    }

    public void setLineCreatedId(Integer lineCreatedId) {
        this.lineCreatedId = lineCreatedId;
    }

    public Date getLineLastUpdateTime() {
        return lineLastUpdateTime;
    }

    public void setLineLastUpdateTime(Date lineLastUpdateTime) {
        this.lineLastUpdateTime = lineLastUpdateTime;
    }

    public String getLineIsStart() {
        return lineIsStart;
    }

    public void setLineIsStart(String lineIsStart) {
        this.lineIsStart = lineIsStart;
    }

    @Override
    public String toString() {
        return "LineInfo{" +
                "lineId=" + lineId +
                ", lineCode='" + lineCode + '\'' +
                ", lineName='" + lineName + '\'' +
                ", lineLength=" + lineLength +
                ", backLength=" + backLength +
                ", productDate=" + productDate +
                ", voltageLevel=" + voltageLevel +
                ", lineStartPole=" + lineStartPole +
                ", lineEndPole=" + lineEndPole +
                ", towerBaseNum=" + towerBaseNum +
                ", maintenanceCompany='" + maintenanceCompany + '\'' +
                ", runningSysId=" + runningSysId +
                ", common='" + common + '\'' +
                ", lineCreationTime=" + lineCreationTime +
                ", lineCreatedId=" + lineCreatedId +
                ", lineLastUpdateTime=" + lineLastUpdateTime +
                ", lineIsStart='" + lineIsStart + '\'' +
                '}';
    }
}