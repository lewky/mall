package com.pinyougou.pojo;

import java.io.Serializable;

public class SpecificationOption implements Serializable {
    private static final long serialVersionUID = -6501671350315921193L;

    private Long id;

    private String optionName;

    private Long specId;

    private Integer orders;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(final String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(final Long specId) {
        this.specId = specId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(final Integer orders) {
        this.orders = orders;
    }
}