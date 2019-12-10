package com.newer.acrossfrom.data.bean;

public class Systemconfig {
    private Integer sysId;
    private String configCode;
    private String configName;
    private Integer configValueId;
    private String configValueName;
    private String sysIsStart;

    public Systemconfig() {
    }

    public Systemconfig(Integer sysId, String configCode, String configName, Integer configValueId, String configValueName, String sysIsStart) {
        this.sysId = sysId;
        this.configCode = configCode;
        this.configName = configName;
        this.configValueId = configValueId;
        this.configValueName = configValueName;
        this.sysIsStart = sysIsStart;
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public Integer getConfigValueId() {
        return configValueId;
    }

    public void setConfigValueId(Integer configValueId) {
        this.configValueId = configValueId;
    }

    public String getConfigValueName() {
        return configValueName;
    }

    public void setConfigValueName(String configValueName) {
        this.configValueName = configValueName;
    }

    public String getSysIsStart() {
        return sysIsStart;
    }

    public void setSysIsStart(String sysIsStart) {
        this.sysIsStart = sysIsStart;
    }

    @Override
    public String toString() {
        return "Systemconfig{" +
                "sysId=" + sysId +
                ", configCode='" + configCode + '\'' +
                ", configName='" + configName + '\'' +
                ", configValueId=" + configValueId +
                ", configValueName='" + configValueName + '\'' +
                ", sysIsStart='" + sysIsStart + '\'' +
                '}';
    }
}