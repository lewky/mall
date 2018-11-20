// Copyright (c) 2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION pinyougou-pojo.1.0.0
// ============================================================================
// CHANGE LOG
// pinyougou-pojo.1.0.0 : 2018-11-01, Lewis.Liu created
// ============================================================================
package com.pinyougou.dto;

import java.io.Serializable;

/**
 * 操作结果(数据的增删改操作的结果)
 * @author Lewis.Liu
 *
 */
public class ExecutionResult implements Serializable {
    private static final long serialVersionUID = -5020596427924471759L;

    //是否成功
    private Boolean success;

    //信息
    private String message;

    /**
     * @param success
     * @param message
     */
    public ExecutionResult(final Boolean success, final String message) {
        super();
        this.success = success;
        this.message = message;
    }

    /**
     * @return the success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(final Boolean success) {
        this.success = success;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
    }

}
