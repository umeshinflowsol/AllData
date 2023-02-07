package com.inflow.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StudentTester {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("Config.class");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
