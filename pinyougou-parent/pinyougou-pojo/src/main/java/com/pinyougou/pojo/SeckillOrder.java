package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SeckillOrder implements Serializable {
    private static final long serialVersionUID = -1564496488972964190L;

    private Long id;

    private Long seckillId;

    private BigDecimal money;

    private String userId;

    private String sellerId;

    private Date createTime;

    private Date payTime;

    private String status;

    private String receiverAddress;

    private String receiverMobile;

    private String receiver;

    private String transactionId;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(final Long seckillId) {
        this.seckillId = seckillId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(final BigDecimal money) {
        this.money = money;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(final String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(final Date payTime) {
        this.payTime = payTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(final String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(final String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(final String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }
}