package com.inflow.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBookConfiguration {

    @Bean
    public Author authorBean(){

        return new Author("umesh","Bangalore");
    }

    @Bean
    public Book bookBean(){
        Book book=new Book();
        book.setIsbn("kaalk");
        book.setYear("2022");
        book.setAuthor(authorBean());
        return book;
    }
}
