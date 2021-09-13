package com.example.usercustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.service.UserBeanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Reference
    private UserBeanService dubboService;

    @RequestMapping("/findAll")
    public String findAll(){
        return dubboService.doRead(new UserBean(1,20,"张三","浙江省杭州市江干区"));
    }
}
