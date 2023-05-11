package com.project.usercenter.service;

import com.project.usercenter.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.StringTokenizer;

@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("Huang Lijing");
        user.setUserAccount("123456");
        user.setAvatarUrl("https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLendIAeR8J99Rt9kQkLkHOy1ZKdKf6ZWQjNv6uwj4nL3STYhmzjibhaeLAytyBxKgDdOXN7vVXzgw/132");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("17724371296");
        user.setEmail("2438390167@qq.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }



}