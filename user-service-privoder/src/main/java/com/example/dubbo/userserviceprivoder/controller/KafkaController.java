package com.example.dubbo.userserviceprivoder.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiXiaoFeng
 * @date 2021年12月23日 10:38
 */
@Component
//@RequestMapping("/kafka")
public class KafkaController {

 /*   @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    private static String TOPIC_NAME = "second-topic";

    *//**
     * 发送消息
     * @return
     *//*
    @RequestMapping(value = "/sendMessage")
    public String sendMessage() {
        kafkaTemplate.send(TOPIC_NAME,0,"key","this is a springboot message");
        return "success";
    }
*/

    /**
     * 接收消息
     * @param record
     * @param ack
     */
    @KafkaListener(topics = "second-topic",groupId = "default-group")
    public void listenGroup(ConsumerRecord<String,String> record, Acknowledgment ack) {
        String value = record.value();
        System.out.println("========="+value);
        System.out.println("========="+record);
        ack.acknowledge();//手动提交
    }
}
