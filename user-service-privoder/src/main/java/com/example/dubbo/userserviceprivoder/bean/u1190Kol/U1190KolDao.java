package com.example.dubbo.userserviceprivoder.bean.u1190Kol;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service
@Component
public class U1190KolDao implements U1190KolMapper {
    protected Logger logger = LoggerFactory.getLogger(U1190KolDao.class);
    @Resource
    U1190KolMapper u1190KolMapper;

    @Override
    public U1190KolDBO doRead(String puk) {
        logger.info("puk="+puk);
        return u1190KolMapper.doRead(puk);
    }

    @Override
    public List<U1190KolDBO> doSelectList(U1190KolDBO param) {
        return u1190KolMapper.doSelectList(param);
    }
}
