package com.example.dubbo.userserviceprivoder.kafka;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

/**
 * @author LiXiaoFeng
 * @date 2021年12月20日 11:39
 */
public class Producer {
    private static String IP_ADDRESS = "101.43.13.93:9092,101.43.13.93:9093,101.43.13.93:9094";
    private static String TOPIC_NAME = "second-topic";

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,IP_ADDRESS);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String,String> producer = new KafkaProducer(properties);
        ProducerRecord<String,String> producerRecord = new ProducerRecord<String,String>(TOPIC_NAME,"0","Java Test");
        //同步发送
        RecordMetadata recordMetadata = producer.send(producerRecord).get();
        System.out.println("=======topic="+recordMetadata.topic()+"，partition="+recordMetadata.partition()+"，offset="+recordMetadata.offset());

        //异步发送
//        producer.send(producerRecord, new Callback() {
//            @Override
//            public void onCompletion(RecordMetadata metadata, Exception exception) {
//                if(exception != null) {
//                    System.out.println(exception);
//                }
//                if (metadata != null) {
//                    System.out.println("=======topic="+metadata.topic()+"，partition="+metadata.partition()+"，offset="+metadata.offset());
//                }
//            }
//        });
//        Thread.sleep(100000L);

        producer.close();

    }
}
