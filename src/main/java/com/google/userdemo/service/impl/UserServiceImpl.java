package com.google.userdemo.service.impl;

import com.google.userdemo.entity.User;
import com.google.userdemo.mapper.UserMapper;
import com.google.userdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : ZhangJia
 * @Date : 2020/3/27 18:48
 * @Description : 
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean register(User user) {
        return userMapper.insert(user) == 1;
    }
}
