package com.pinyougou.pojo;

import java.io.Serializable;

public class Content implements Serializable {
    private static final long serialVersionUID = 6202885884519605299L;

    private Long id;

    private Long categoryId;

    private String title;

    private String url;

    private String pic;

    private String status;

    private Integer sortOrder;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(final Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(final String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(final Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}