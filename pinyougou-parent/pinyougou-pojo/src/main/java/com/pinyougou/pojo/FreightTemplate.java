package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;

public class FreightTemplate implements Serializable {
    private static final long serialVersionUID = -6912650278645533046L;

    private Long id;

    private String sellerId;

    private String isDefault;

    private String name;

    private String sendTimeType;

    private Long price;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(final String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(final String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSendTimeType() {
        return sendTimeType;
    }

    public void setSendTimeType(final String sendTimeType) {
        this.sendTimeType = sendTimeType == null ? null : sendTimeType.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(final Long price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }
}