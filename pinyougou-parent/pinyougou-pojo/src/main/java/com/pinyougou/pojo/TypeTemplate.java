package com.pinyougou.pojo;

import java.io.Serializable;

public class TypeTemplate implements Serializable {
    private static final long serialVersionUID = 1052190869702363112L;

    private Long id;

    private String name;

    private String specIds;

    private String brandIds;

    private String customAttributeItems;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(final String specIds) {
        this.specIds = specIds == null ? null : specIds.trim();
    }

    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(final String brandIds) {
        this.brandIds = brandIds == null ? null : brandIds.trim();
    }

    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(final String customAttributeItems) {
        this.customAttributeItems = customAttributeItems == null ? null : customAttributeItems.trim();
    }
}