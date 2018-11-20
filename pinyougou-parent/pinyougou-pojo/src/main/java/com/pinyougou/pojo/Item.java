package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Item implements Serializable {
    private static final long serialVersionUID = -8450461374139999455L;

    private Long id;

    private String title;

    private String sellPoint;

    private BigDecimal price;

    private Integer stockCount;

    private Integer num;

    private String barcode;

    private String image;

    private Long categoryid;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String itemSn;

    private BigDecimal costPirce;

    private BigDecimal marketPrice;

    private String isDefault;

    private Long goodsId;

    private String sellerId;

    private String cartThumbnail;

    private String category;

    private String brand;

    private String spec;

    private String seller;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(final String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(final Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(final Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(final String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(final Long categoryid) {
        this.categoryid = categoryid;
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

    public String getItemSn() {
        return itemSn;
    }

    public void setItemSn(final String itemSn) {
        this.itemSn = itemSn == null ? null : itemSn.trim();
    }

    public BigDecimal getCostPirce() {
        return costPirce;
    }

    public void setCostPirce(final BigDecimal costPirce) {
        this.costPirce = costPirce;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(final BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(final String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(final Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(final String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getCartThumbnail() {
        return cartThumbnail;
    }

    public void setCartThumbnail(final String cartThumbnail) {
        this.cartThumbnail = cartThumbnail == null ? null : cartThumbnail.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(final String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(final String seller) {
        this.seller = seller == null ? null : seller.trim();
    }
}