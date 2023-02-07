package com.inflow.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTester {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("MyBookConfiguration.class");
        System.out.println("AnnotationConfigApplicationContext");
        Book contextBean = context.getBean("bean2",Book.class);
        System.out.println("contextBean");
        System.out.println(contextBean);

    }
}
