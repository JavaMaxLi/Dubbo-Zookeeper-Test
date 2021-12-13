package com.example.dubbo.userserviceprivoder.nettyDubboProvider.impl;

import dubbonetty.dubbonetty.service.HelloService;

/**
 * @author LiXiaoFeng
 * @date 2021年12月13日 17:23
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String param) {
        return "你好，"+param;
    }
}
