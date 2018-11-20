package com.pinyougou.pojo;

import java.io.Serializable;

public class ContentCategory implements Serializable {
    private static final long serialVersionUID = 4693545865477330737L;

    private Long id;

    private String name;

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
}