package com.google.userdemo.controller;

import com.google.userdemo.entity.User;
import com.google.userdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : ZhangJia
 * @Date : 2020/3/27 18:49
 * @Description : 
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerView() {
        return "register";
    }

    @PostMapping(value = "/register", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<String, Object> bookClassificationList(User user) {
        System.out.println("前台传来的user = " + user);
        Map<String, Object> map = new HashMap<>();
        map.put("result", userService.register(user));
        return map;
    }
}
