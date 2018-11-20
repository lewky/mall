package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private static final long serialVersionUID = 1240990444368827377L;

    private Long orderId;

    private BigDecimal payment;

    private String paymentType;

    private String postFee;

    private String status;

    private Date createTime;

    private Date updateTime;

    private Date paymentTime;

    private Date consignTime;

    private Date endTime;

    private Date closeTime;

    private String shippingName;

    private String shippingCode;

    private String userId;

    private String buyerMessage;

    private String buyerNick;

    private String buyerRate;

    private String receiverAreaName;

    private String receiverMobile;

    private String receiverZipCode;

    private String receiver;

    private Date expire;

    private String invoiceType;

    private String sourceType;

    private String sellerId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(final BigDecimal payment) {
        this.payment = payment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(final String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(final String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(final Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(final Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(final Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(final String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(final String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(final String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(final String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public String getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(final String buyerRate) {
        this.buyerRate = buyerRate == null ? null : buyerRate.trim();
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public void setReceiverAreaName(final String receiverAreaName) {
        this.receiverAreaName = receiverAreaName == null ? null : receiverAreaName.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(final String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    public void setReceiverZipCode(final String receiverZipCode) {
        this.receiverZipCode = receiverZipCode == null ? null : receiverZipCode.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(final String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(final Date expire) {
        this.expire = expire;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(final String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(final String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(final String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }
}