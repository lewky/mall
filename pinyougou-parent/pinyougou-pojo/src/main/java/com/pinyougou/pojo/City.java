package com.pinyougou.pojo;

import java.io.Serializable;

public class City implements Serializable {
    private static final long serialVersionUID = -3090099221399324862L;

    private Integer id;

    private String cityid;

    private String city;

    private String provinceid;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(final String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(final String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }
}