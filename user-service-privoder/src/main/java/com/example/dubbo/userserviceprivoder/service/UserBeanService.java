package com.example.dubbo.userserviceprivoder.service;

import com.example.dubbo.userserviceprivoder.bean.UserBean;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolDBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserBeanService {

    String doRead(UserBean user);

    U1190KolDBO doRead(String puk);

    List<U1190KolDBO> doSelectList(U1190KolDBO param);
}
