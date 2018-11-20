package com.pinyougou.pojo;

import java.io.Serializable;

public class GoodsDesc implements Serializable {
    private static final long serialVersionUID = -7405298140497362200L;

    private Long goodsId;

    private String introduction;

    private String specificationItems;

    private String customAttributeItems;

    private String itemImages;

    private String packageList;

    private String saleService;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(final Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(final String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getSpecificationItems() {
        return specificationItems;
    }

    public void setSpecificationItems(final String specificationItems) {
        this.specificationItems = specificationItems == null ? null : specificationItems.trim();
    }

    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(final String customAttributeItems) {
        this.customAttributeItems = customAttributeItems == null ? null : customAttributeItems.trim();
    }

    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(final String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(final String packageList) {
        this.packageList = packageList == null ? null : packageList.trim();
    }

    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(final String saleService) {
        this.saleService = saleService == null ? null : saleService.trim();
    }
}