package com.example.dubbo.userserviceprivoder.service;

import com.example.dubbo.userserviceprivoder.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBeanService {

    String doRead(UserBean user);

}
