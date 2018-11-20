package com.pinyougou.pojo;

import java.io.Serializable;

public class Area implements Serializable {
    private static final long serialVersionUID = -3400112513181024314L;

    private Integer id;

    private String areaid;

    private String area;

    private String cityid;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(final String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(final String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(final String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }
}