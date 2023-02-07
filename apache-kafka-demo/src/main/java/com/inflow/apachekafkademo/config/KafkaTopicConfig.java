package com.inflow.apachekafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic  myTopic(){
        return TopicBuilder.name("myjava")
                .partitions(3)
                .replicas(2)
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("myjavaguides")
                .partitions(3)
                .replicas(2)
                .build();
    }
}
