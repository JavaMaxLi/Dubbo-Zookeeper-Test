package com.example.dubbo.userserviceprivoder.bean.u1190Kol;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface U1190KolMapper {
    U1190KolDBO doRead(@Param("puk") String puk);

    List<U1190KolDBO> doSelectList(U1190KolDBO param);
}
