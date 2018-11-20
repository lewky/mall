package com.pinyougou.pojo;

import java.io.Serializable;

public class Province implements Serializable {
    private static final long serialVersionUID = 1550744152713653536L;

    private Integer id;

    private String provinceid;

    private String province;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(final String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(final String province) {
        this.province = province == null ? null : province.trim();
    }
}