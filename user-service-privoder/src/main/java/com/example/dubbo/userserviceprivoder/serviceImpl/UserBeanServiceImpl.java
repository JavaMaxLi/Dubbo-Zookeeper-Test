package com.example.dubbo.userserviceprivoder.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.service.UserBeanService;
import org.springframework.stereotype.Component;

@Service(version = "1.0")
@Component
public class UserBeanServiceImpl implements UserBeanService {
    @Override
    public String doRead(UserBean user) {
        return user.toString();
    }
}
