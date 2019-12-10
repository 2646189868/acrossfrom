package com.newer.acrossfrom.data.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date roleCreationTime;

    private Integer roleCreatedBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date roleLastUpdateTime;

    private String roleIsStart;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getRoleCreationTime() {
        return roleCreationTime;
    }

    public void setRoleCreationTime(Date roleCreationTime) {
        this.roleCreationTime = roleCreationTime;
    }

    public Integer getRoleCreatedBy() {
        return roleCreatedBy;
    }

    public void setRoleCreatedBy(Integer roleCreatedBy) {
        this.roleCreatedBy = roleCreatedBy;
    }

    public Date getRoleLastUpdateTime() {
        return roleLastUpdateTime;
    }

    public void setRoleLastUpdateTime(Date roleLastUpdateTime) {
        this.roleLastUpdateTime = roleLastUpdateTime;
    }

    public String getRoleIsStart() {
        return roleIsStart;
    }

    public void setRoleIsStart(String roleIsStart) {
        this.roleIsStart = roleIsStart == null ? null : roleIsStart.trim();
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleCreationTime=" + roleCreationTime +
                ", roleCreatedBy=" + roleCreatedBy +
                ", roleLastUpdateTime=" + roleLastUpdateTime +
                ", roleIsStart='" + roleIsStart + '\'' +
                '}';
    }
}