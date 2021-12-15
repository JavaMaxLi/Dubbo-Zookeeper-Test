package com.example.usercustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolDBO;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolMapper;
import com.example.dubbo.userserviceprivoder.service.UserBeanService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DubboController {
    @Reference(check = false,version = "1.0")
    private UserBeanService dubboService;

    @RequestMapping("/findAll")
    @HystrixCommand(fallbackMethod = "hello")
    public String findAll(){
        return dubboService.doRead(new UserBean(1,20,"张三","浙江省杭州市江干区"));
    }

    public String hello(){

        return new UserBean(0,0,"游客","空").toString();
    }


    @RequestMapping(value = "/selectKol")
    public U1190KolDBO selectKol(String puk) {
        return dubboService.doRead(puk);
    }

    @RequestMapping(value = "/getKolList")
    @HystrixCommand(fallbackMethod = "errorDefaultMethod")
    public List<U1190KolDBO> getKolList(U1190KolDBO param) {

        return dubboService.doSelectList(param);
    }

    public List<U1190KolDBO> errorDefaultMethod(U1190KolDBO param) {
        return Arrays.asList(new U1190KolDBO("1","游客","男","","","","智慧谷","20","1234567890","","","","","","","","","","","","",""));
    }
}
