package com.project.usercenter.service;

import com.project.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author ze
 * @description 针对表【user(用户表)】的数据库操作Service、用户服务
 * @createDate 2023-05-02 17:03:59
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     *
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     * 用户登录接口
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 用户脱敏的信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 请求,用户注销
     * @return
     */
    int userLogout(HttpServletRequest request);


}
