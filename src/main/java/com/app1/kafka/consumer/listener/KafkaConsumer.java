package com.app1.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.app1.kafka.consumer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example")
    public void consume(String message) {
    	/*if (true) {
    		throw new RuntimeException("test111");
    	}*/
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example2",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
