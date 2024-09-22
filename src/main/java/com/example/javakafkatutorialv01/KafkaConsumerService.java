package com.example.javakafkatutorialv01;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics= "hello-world-topic", groupId = "hello-world-group")
    public void listen(String message){
        System.out.println("Received Message: "+ message);
    }
}
