package com.google.userdemo;

import com.google.userdemo.entity.User;
import com.google.userdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("张甲");
        user.setPassword("zhangjia");
        userMapper.insert(user);
    }

}
