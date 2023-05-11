package com.project.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author ze
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionID = 319124176373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
