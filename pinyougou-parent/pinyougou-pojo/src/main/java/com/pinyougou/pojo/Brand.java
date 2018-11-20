package com.pinyougou.pojo;

import java.io.Serializable;

public class Brand implements Serializable {
    private static final long serialVersionUID = -8315881228799842049L;

    private Long id;

    private String name;

    private String firstChar;

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

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(final String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }
}