package com.google.userdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.google.userdemo.mapper")
public class UserDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDemoApplication.class, args);
    }

}
