package com.example.dubbo.userserviceprivoder.controller;

import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolDBO;
import com.example.dubbo.userserviceprivoder.bean.u1190Kol.U1190KolDao;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class U1190Controller {
    protected Logger logger = LoggerFactory.getLogger(U1190Controller.class);
    @Resource
    U1190KolDao u1190KolDao;

    @RequestMapping(value = "/getU1190Kol")
    public U1190KolDBO getU1190Kol(String puk) {
        return u1190KolDao.doRead(puk);
    }

    @RequestMapping(value = "/getU1190KolList")
    public List<U1190KolDBO> getU1190Kol(U1190KolDBO param) {
        logger.info("param="+param.toString());
        return u1190KolDao.doSelectList(param);
    }

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    private static String TOPIC_NAME = "second-topic";

    /**
     * 发送消息
     * @return
     */
    @RequestMapping(value = "/sendMessage")
    public String sendMessage() {
        kafkaTemplate.send(TOPIC_NAME,0,"key","this is a springboot message");
        return "success";
    }


}
