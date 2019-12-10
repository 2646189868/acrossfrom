package com.newer.acrossfrom.data.bean;

import java.util.Date;

public class Inspectiontask {
    private Integer inspectionId;
    private String taskCode;
    private String inspectionTaskName;
    private Integer inspectionLineId;
    private Integer inspectionStartPole;
    private Integer inspectionEndPole;
    private Integer issuedById;
    private Date issuedTime;
    private Integer taskStatus;
    private Date finishTime;
    private String isCancel;
    private String common;
    private Date inspectionCreationTime;
    private String inspectionCreatedBy;
    private Date inspectionLastUpdateTime;

    private LineInfo lineInfo;
    private PoleInfo poleInfo;
    private PoleInfo endPoleInfo;
    private Consumer consumer;
    private Systemconfig systemconfig;

    public Inspectiontask() {
    }

    public Inspectiontask(Integer inspectionId, String taskCode, String inspectionTaskName, Integer inspectionLineId, Integer inspectionStartPole, Integer inspectionEndPole, Integer issuedById, Date issuedTime, Integer taskStatus, Date finishTime, String isCancel, String common, Date inspectionCreationTime, String inspectionCreatedBy, Date inspectionLastUpdateTime, LineInfo lineInfo, PoleInfo poleInfo, PoleInfo endPoleInfo, Consumer consumer, Systemconfig systemconfig) {
        this.inspectionId = inspectionId;
        this.taskCode = taskCode;
        this.inspectionTaskName = inspectionTaskName;
        this.inspectionLineId = inspectionLineId;
        this.inspectionStartPole = inspectionStartPole;
        this.inspectionEndPole = inspectionEndPole;
        this.issuedById = issuedById;
        this.issuedTime = issuedTime;
        this.taskStatus = taskStatus;
        this.finishTime = finishTime;
        this.isCancel = isCancel;
        this.common = common;
        this.inspectionCreationTime = inspectionCreationTime;
        this.inspectionCreatedBy = inspectionCreatedBy;
        this.inspectionLastUpdateTime = inspectionLastUpdateTime;
        this.lineInfo = lineInfo;
        this.poleInfo = poleInfo;
        this.endPoleInfo = endPoleInfo;
        this.consumer = consumer;
        this.systemconfig = systemconfig;
    }

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getInspectionTaskName() {
        return inspectionTaskName;
    }

    public void setInspectionTaskName(String inspectionTaskName) {
        this.inspectionTaskName = inspectionTaskName;
    }

    public Integer getInspectionLineId() {
        return inspectionLineId;
    }

    public void setInspectionLineId(Integer inspectionLineId) {
        this.inspectionLineId = inspectionLineId;
    }

    public Integer getInspectionStartPole() {
        return inspectionStartPole;
    }

    public void setInspectionStartPole(Integer inspectionStartPole) {
        this.inspectionStartPole = inspectionStartPole;
    }

    public Integer getInspectionEndPole() {
        return inspectionEndPole;
    }

    public void setInspectionEndPole(Integer inspectionEndPole) {
        this.inspectionEndPole = inspectionEndPole;
    }

    public Integer getIssuedById() {
        return issuedById;
    }

    public void setIssuedById(Integer issuedById) {
        this.issuedById = issuedById;
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public Date getInspectionCreationTime() {
        return inspectionCreationTime;
    }

    public void setInspectionCreationTime(Date inspectionCreationTime) {
        this.inspectionCreationTime = inspectionCreationTime;
    }

    public String getInspectionCreatedBy() {
        return inspectionCreatedBy;
    }

    public void setInspectionCreatedBy(String inspectionCreatedBy) {
        this.inspectionCreatedBy = inspectionCreatedBy;
    }

    public Date getInspectionLastUpdateTime() {
        return inspectionLastUpdateTime;
    }

    public void setInspectionLastUpdateTime(Date inspectionLastUpdateTime) {
        this.inspectionLastUpdateTime = inspectionLastUpdateTime;
    }

    public LineInfo getLineInfo() {
        return lineInfo;
    }

    public void setLineInfo(LineInfo lineInfo) {
        this.lineInfo = lineInfo;
    }

    public PoleInfo getPoleInfo() {
        return poleInfo;
    }

    public void setPoleInfo(PoleInfo poleInfo) {
        this.poleInfo = poleInfo;
    }

    public PoleInfo getEndPoleInfo() {
        return endPoleInfo;
    }

    public void setEndPoleInfo(PoleInfo endPoleInfo) {
        this.endPoleInfo = endPoleInfo;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Systemconfig getSystemconfig() {
        return systemconfig;
    }

    public void setSystemconfig(Systemconfig systemconfig) {
        this.systemconfig = systemconfig;
    }

    @Override
    public String toString() {
        return "Inspectiontask{" +
                "inspectionId=" + inspectionId +
                ", taskCode='" + taskCode + '\'' +
                ", inspectionTaskName='" + inspectionTaskName + '\'' +
                ", inspectionLineId=" + inspectionLineId +
                ", inspectionStartPole=" + inspectionStartPole +
                ", inspectionEndPole=" + inspectionEndPole +
                ", issuedById=" + issuedById +
                ", issuedTime=" + issuedTime +
                ", taskStatus=" + taskStatus +
                ", finishTime=" + finishTime +
                ", isCancel='" + isCancel + '\'' +
                ", common='" + common + '\'' +
                ", inspectionCreationTime=" + inspectionCreationTime +
                ", inspectionCreatedBy='" + inspectionCreatedBy + '\'' +
                ", inspectionLastUpdateTime=" + inspectionLastUpdateTime +
                ", lineInfo=" + lineInfo.toString() +
                ", poleInfo=" + poleInfo.toString() +
                ", poleInfo=" + endPoleInfo.toString() +
                ", consumer=" + consumer.toString() +
                ", systemconfig=" + systemconfig.toString() +
                '}';
    }
}