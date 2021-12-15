package com.example.dubbo.userserviceprivoder.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolDBO;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolMapper;
import com.example.dubbo.userserviceprivoder.service.UserBeanService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(version = "1.0",loadbalance = "RoundRobin")
@Component
public class UserBeanServiceImpl implements UserBeanService {
    protected Logger logger = LoggerFactory.getLogger(UserBeanServiceImpl.class);

    @Autowired
    U1190KolMapper u1190KolMapper;

    public U1190KolDBO doRead(String puk) {
        U1190KolDBO param = u1190KolMapper.doRead(puk);
        logger.info("调用UserBeanServiceImpl 1.0=doRead(String puk)");
        return param;
    }

    @Override
    public List<U1190KolDBO> doSelectList(U1190KolDBO param) {
        return u1190KolMapper.doSelectList(param);
    }

    @Override
    //@HystrixCommand(fallbackMethod = "hello")
    public String doRead(UserBean user) {
        logger.info("调用UserBeanServiceImpl 1.0");
        if( Math.random() > 0.5) {
            throw new RuntimeException();
        }

        return user.toString();
    }

    public String hello(){

        return new UserBean(0,0,"游客","空").toString();
    }

}
