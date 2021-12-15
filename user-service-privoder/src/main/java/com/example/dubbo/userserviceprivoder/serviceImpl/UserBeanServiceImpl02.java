package com.example.dubbo.userserviceprivoder.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.service.UserBeanService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(version = "2.0",loadbalance = "RoundRobin")
@Component
public class UserBeanServiceImpl02 implements UserBeanService {
    protected Logger logger = LoggerFactory.getLogger(UserBeanServiceImpl02.class);
    @Override
    @HystrixCommand
    public String doRead(UserBean user) {
        logger.info("调用UserBeanServiceImpl 2.0");
        return user.toString();
    }
}
