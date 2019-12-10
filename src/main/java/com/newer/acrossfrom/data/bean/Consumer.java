package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Consumer {
    private Integer userId;

    private String userCode;

    private String userName;

    private String userPassword;

    private String sex;

    private BigDecimal age;

    private Date entryDate;

    private Date dimissionDate;

    private String phoneTel;

    private String email;

    private Date userCreationTime;

    private Date lastLoginTime;

    private String userCreatedBy;

    private Date userLastUpdateTime;

    private String userStatus;

    public Consumer() {
    }

    public Consumer(Integer userId, String userCode, String userName, String userPassword, String sex, BigDecimal age, Date entryDate, Date dimissionDate, String phoneTel, String email, Date userCreationTime, Date lastLoginTime, String userCreatedBy, Date userLastUpdateTime, String userStatus) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.sex = sex;
        this.age = age;
        this.entryDate = entryDate;
        this.dimissionDate = dimissionDate;
        this.phoneTel = phoneTel;
        this.email = email;
        this.userCreationTime = userCreationTime;
        this.lastLoginTime = lastLoginTime;
        this.userCreatedBy = userCreatedBy;
        this.userLastUpdateTime = userLastUpdateTime;
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDimissionDate() {
        return dimissionDate;
    }

    public void setDimissionDate(Date dimissionDate) {
        this.dimissionDate = dimissionDate;
    }

    public String getPhoneTel() {
        return phoneTel;
    }

    public void setPhoneTel(String phoneTel) {
        this.phoneTel = phoneTel == null ? null : phoneTel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getUserCreationTime() {
        return userCreationTime;
    }

    public void setUserCreationTime(Date userCreationTime) {
        this.userCreationTime = userCreationTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getUserCreatedBy() {
        return userCreatedBy;
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy == null ? null : userCreatedBy.trim();
    }

    public Date getUserLastUpdateTime() {
        return userLastUpdateTime;
    }

    public void setUserLastUpdateTime(Date userLastUpdateTime) {
        this.userLastUpdateTime = userLastUpdateTime;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "userId=" + userId +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", entryDate=" + entryDate +
                ", dimissionDate=" + dimissionDate +
                ", phoneTel='" + phoneTel + '\'' +
                ", email='" + email + '\'' +
                ", userCreationTime=" + userCreationTime +
                ", lastLoginTime=" + lastLoginTime +
                ", userCreatedBy='" + userCreatedBy + '\'' +
                ", userLastUpdateTime=" + userLastUpdateTime +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}