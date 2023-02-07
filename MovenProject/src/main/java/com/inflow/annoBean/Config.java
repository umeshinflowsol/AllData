package com.inflow.annoBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{


    @Bean
    public Author authorBean(){

        return new Author("umesh","Bangalore");
    }

    @Bean

    public Book bookBean(){

        return new Book("qwer","12werty",authorBean());
    }
}

