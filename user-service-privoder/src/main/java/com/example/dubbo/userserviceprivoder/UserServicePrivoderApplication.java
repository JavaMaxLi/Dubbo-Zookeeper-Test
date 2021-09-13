package com.example.dubbo.userserviceprivoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UserServicePrivoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServicePrivoderApplication.class, args);
    }

}
