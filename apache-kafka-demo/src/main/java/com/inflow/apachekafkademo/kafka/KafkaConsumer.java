package com.inflow.apachekafkademo.kafka;

import com.inflow.apachekafkademo.playload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "myjava", groupId = "mygroup2")
    public void consume(String message){
        LOGGER.info(String.format("Message received mygroup2 -> %s", message));
    }

    @KafkaListener(topics = "myjavaguides", groupId = "mygroup2")
    public void consume(User user){
       LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
   }

    @KafkaListener(topics = "myjavaguides", groupId = "mygroup")
    public void consumer(String  msg){
        LOGGER.info(String.format("Json message recieved mygroup-> %s", msg));
    }
}

