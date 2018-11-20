package com.pinyougou.pojo;

import java.io.Serializable;

public class ItemCat implements Serializable {
    private static final long serialVersionUID = -5192195713480494105L;

    private Long id;

    private Long parentId;

    private String name;

    private Long typeId;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(final Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(final Long typeId) {
        this.typeId = typeId;
    }
}