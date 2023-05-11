package com.project.usercenter.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/***
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    /**
     * 状态码
     */
    private  int code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回提示
     */
    private String message;
    /**
     * 返回描述
     */
    private String description;

    public BaseResponse(int code,T data){
        this(code,data,"","");
    }
    public BaseResponse(int code,String message,String description){
        this(code,null,message,description);
    }
    public BaseResponse(int code,T data,String message,String description){
        this.data = data;
        this.code = code;
        this.message = message;
        this.description = description;
    }
    public BaseResponse(ErrorCode code){
        this(code.getCode(),null,code.getMessage(),code.getDescription());
    }
}
