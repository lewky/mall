package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private static final long serialVersionUID = -3888154864571208139L;

    private Long id;

    private String sellerId;

    private String goodsName;

    private Long defaultItemId;

    private String auditStatus;

    private String isMarketable;

    private Long brandId;

    private String caption;

    private Long category1Id;

    private Long category2Id;

    private Long category3Id;

    private String smallPic;

    private BigDecimal price;

    private Long typeTemplateId;

    private String isEnableSpec;

    private String isDelete;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(final String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getDefaultItemId() {
        return defaultItemId;
    }

    public void setDefaultItemId(final Long defaultItemId) {
        this.defaultItemId = defaultItemId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(final String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(final String isMarketable) {
        this.isMarketable = isMarketable == null ? null : isMarketable.trim();
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(final Long brandId) {
        this.brandId = brandId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(final String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public Long getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(final Long category1Id) {
        this.category1Id = category1Id;
    }

    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(final Long category2Id) {
        this.category2Id = category2Id;
    }

    public Long getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(final Long category3Id) {
        this.category3Id = category3Id;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(final String smallPic) {
        this.smallPic = smallPic == null ? null : smallPic.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    public void setTypeTemplateId(final Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    public void setIsEnableSpec(final String isEnableSpec) {
        this.isEnableSpec = isEnableSpec == null ? null : isEnableSpec.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(final String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}