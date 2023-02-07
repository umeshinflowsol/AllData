package com.inflow.apachekafkademo.controller;

import com.inflow.apachekafkademo.kafka.KafkaProducer;
import com.inflow.apachekafkademo.playload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {


    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //http:localhost:8080/posdata/
    @GetMapping("/publish/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable String message){
         kafkaProducer.sendMessage(message);
         return ResponseEntity.ok("message sent to the topic");
    }
    @PostMapping("/sendData")
    public ResponseEntity<String> publish(@RequestBody User user){
        return ResponseEntity.ok("Json message sent to kafka topic");
    }

    @GetMapping("/sendmsg/{msg}")
    public ResponseEntity<String> msg(@PathVariable String msg){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("message sent to the topic");
    }
}
