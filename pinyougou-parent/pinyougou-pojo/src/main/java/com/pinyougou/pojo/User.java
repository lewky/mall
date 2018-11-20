package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -743836578906316194L;

    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;

    private String sourceType;

    private String nickName;

    private String name;

    private String status;

    private String headPic;

    private String qq;

    private Long accountBalance;

    private String isMobileCheck;

    private String isEmailCheck;

    private String sex;

    private Integer userLevel;

    private Integer points;

    private Integer experienceValue;

    private Date birthday;

    private Date lastLoginTime;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(final String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(final String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(final String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    public void setIsMobileCheck(final String isMobileCheck) {
        this.isMobileCheck = isMobileCheck == null ? null : isMobileCheck.trim();
    }

    public String getIsEmailCheck() {
        return isEmailCheck;
    }

    public void setIsEmailCheck(final String isEmailCheck) {
        this.isEmailCheck = isEmailCheck == null ? null : isEmailCheck.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(final String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(final Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(final Integer points) {
        this.points = points;
    }

    public Integer getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(final Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(final Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(final Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}