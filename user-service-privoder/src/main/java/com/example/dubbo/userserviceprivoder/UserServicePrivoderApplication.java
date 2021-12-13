package com.example.dubbo.userserviceprivoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
@MapperScan("com.example.dubbo.userserviceprivoder.bean")
public class UserServicePrivoderApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserServicePrivoderApplication.class, args);
    }

}
