package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;

public class Address implements Serializable{
    private static final long serialVersionUID = -4689694958239207095L;

    private Long id;

    private String userId;

    private String provinceId;

    private String cityId;

    private String townId;

    private String mobile;

    private String address;

    private String contact;

    private String isDefault;

    private String notes;

    private Date createDate;

    private String alias;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(final String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(final String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(final String townId) {
        this.townId = townId == null ? null : townId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(final String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(final String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(final String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Date createDate) {
        this.createDate = createDate;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias == null ? null : alias.trim();
    }
}