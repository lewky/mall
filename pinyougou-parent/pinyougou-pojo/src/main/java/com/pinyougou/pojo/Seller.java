package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
    private static final long serialVersionUID = -6636378626574886353L;

    private String sellerId;

    private String name;

    private String nickName;

    private String password;

    private String email;

    private String mobile;

    private String telephone;

    private String status;

    private String addressDetail;

    private String linkmanName;

    private String linkmanQq;

    private String linkmanMobile;

    private String linkmanEmail;

    private String licenseNumber;

    private String taxNumber;

    private String orgNumber;

    private Long address;

    private String logoPic;

    private String brief;

    private Date createTime;

    private String legalPerson;

    private String legalPersonCardId;

    private String bankUser;

    private String bankName;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(final String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(final String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(final String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(final String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanQq() {
        return linkmanQq;
    }

    public void setLinkmanQq(final String linkmanQq) {
        this.linkmanQq = linkmanQq == null ? null : linkmanQq.trim();
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(final String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(final String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(final String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(final String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(final String orgNumber) {
        this.orgNumber = orgNumber == null ? null : orgNumber.trim();
    }

    public Long getAddress() {
        return address;
    }

    public void setAddress(final Long address) {
        this.address = address;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(final String logoPic) {
        this.logoPic = logoPic == null ? null : logoPic.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(final String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(final String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    public void setLegalPersonCardId(final String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId == null ? null : legalPersonCardId.trim();
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(final String bankUser) {
        this.bankUser = bankUser == null ? null : bankUser.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }
}