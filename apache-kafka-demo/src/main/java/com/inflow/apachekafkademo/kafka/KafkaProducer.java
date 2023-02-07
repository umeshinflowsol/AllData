package com.inflow.apachekafkademo.kafka;

import com.inflow.apachekafkademo.playload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private  static final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s",message));
         kafkaTemplate.send("myjava",message);
    }

    public User message(User data){
        LOGGER.info(String.format("Message sent -> %s", data.toString()));
        Message<User> message= MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"myjavaguides")
                .build();

        return (User) kafkaTemplate.send(message);

    }
    public void message(String msg){
        LOGGER.info(String.format("Message sent %s",msg));
        kafkaTemplate.send("myjavaguides",msg);
    }


}
