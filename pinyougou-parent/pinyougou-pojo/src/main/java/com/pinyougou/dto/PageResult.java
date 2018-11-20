// Copyright (c) 2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION pinyougou-pojo.1.0.0
// ============================================================================
// CHANGE LOG
// pinyougou-pojo.1.0.0 : 2018-10-30, Lewis.Liu created
// ============================================================================
package com.pinyougou.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果
 * @author Lewis.Liu
 *
 */
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 7525955026850780021L;

    //总记录数
    private Long total;

    //当前页记录数
    private List<T> rows;

    public PageResult() {
        super();
    }

    /**
     * @param total
     * @param rows
     */
    public PageResult(final Long total, final List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    /**
     * @return the total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(final Long total) {
        this.total = total;
    }

    /**
     * @return the rows
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

}
