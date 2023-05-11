package com.project.usercenter.exeception;

import com.project.usercenter.common.ErrorCode;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException{
    private int code;

    private String description;

    public BusinessException(String message,int code,String description){
        super(message);
        this.code = code;
        this.description = description;
    }
    public BusinessException (ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code=errorCode.getCode();
    }
    public BusinessException (ErrorCode errorCode,String description){
        super(errorCode.getMessage());
        this.code=errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
