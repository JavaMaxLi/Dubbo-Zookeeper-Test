package com.example.dubbo.userserviceprivoder.nettyDubboProvider.impl;




/**
 * @author LiXiaoFeng
 * @date 2021年12月13日 17:23
 */
public class HelloServiceImpl  {

    public String hello(String param) {
        return "你好，"+param;
    }
}
