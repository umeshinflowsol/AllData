package com.inflow.annoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("MyBookConfiguration.class");
        Book contextBean = context.getBean(Book.class);
        System.out.println(contextBean);

    }
}
