package com.project.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户账户
     */
    private String userAccount;

    /**
     * 用户头像

     */
    private String avatarUrl;

    /**
     * 性别

     */
    private Integer gender;

    /**
     * 密码

     */
    private String userPassword;

    /**
     * 电话

     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 0-表示状态正常，没有封号，1表示状态异常
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除，表示是否删除
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 用户名
     */
    private String username;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 角色 0-普通用户 1-管理员
     */
    private Integer userRole;
    /**
     * 编号
     */
    private String planetCode;
}