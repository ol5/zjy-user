package com.google.userdemo.mapper;

import com.google.userdemo.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Author : ZhangJia
 * @Date : 2020/3/27 18:41
 * @Description : 
 */
@Component
public interface UserMapper {
    int insert(User user);
}
