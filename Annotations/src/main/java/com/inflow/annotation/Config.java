package com.inflow.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Config {

    @Bean
    public Student student(){
       return new Student(3,"umesh",tecaher());
    }

    @Bean
    public Tecaher tecaher(){
        return new Tecaher(1,"ummm");
    }
}
