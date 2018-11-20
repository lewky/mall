package com.pinyougou.pojo;

import java.io.Serializable;

public class Specification implements Serializable {
    private static final long serialVersionUID = -972374525762485421L;

    private Long id;

    private String specName;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(final String specName) {
        this.specName = specName == null ? null : specName.trim();
    }
}