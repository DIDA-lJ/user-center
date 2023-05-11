package com.project.usercenter.common;

/**
 * 返回工具类
 */
public class ResultUtils {
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"success","操作成功!");
    }
    public static<T>BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());
    }
    public static<T>BaseResponse<T> error(ErrorCode errorCode,String message,String description){
        return new BaseResponse(errorCode.getCode(),message,description);
    }
    public static<T>BaseResponse<T> error(ErrorCode errorCode,String description){
        return new BaseResponse(errorCode.getCode(),errorCode.getMessage(),description);
    }

    public static BaseResponse error(int code,String message,String description){
        return new BaseResponse<>(code,message,description);
    }
}
