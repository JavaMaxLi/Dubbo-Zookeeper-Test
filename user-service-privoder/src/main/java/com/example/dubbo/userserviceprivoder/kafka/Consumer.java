package com.example.dubbo.userserviceprivoder.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author LiXiaoFeng
 * @date 2021年12月21日 11:37
 */
public class Consumer {
    private static String TOPIC_LIST = "second-topic";
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"101.43.13.93:9092,101.43.13.93:9093,101.43.13.93:9094");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"default-group");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
        //消费者客户端
        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(properties);
        //消费者订阅的主题列表
        consumer.subscribe(Arrays.asList(TOPIC_LIST));

        while (true) {
            ConsumerRecords<String,String> records = consumer.poll(1000);
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("=================="+record.partition()+record.offset()+record.value()+record.topic());
            }
        }
    }
}
