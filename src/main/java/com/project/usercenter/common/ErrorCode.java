package com.project.usercenter.common;

/**
 * 全局错误码
 */
public enum ErrorCode {
    PARAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"请求数据为空",""),
    NO_LOGIN(40100,"未登录",""),
    NO_AUTH(40101,"无权限",""),
    SAVE_ERROR(40102,"用户数据保存异常",""),
    SYSTEM_ERROR(50000,"系统内部异常","");

    /**
     * 状态码描述
     */
    private final int code;
    /**
     * 状态码详情
     */
    private final String message;
    /**
     * 状态码描述
     */
    private final String description;

    ErrorCode(int code,String message,String description){
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public String getDescription() {
        return description;
    }
}
