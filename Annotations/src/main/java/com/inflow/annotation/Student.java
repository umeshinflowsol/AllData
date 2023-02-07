package com.inflow.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private  int id;
    private String name;

    private Tecaher teacher;

    public Student() {
    }

    public Student(int id, String name, Tecaher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tecaher getTeacher() {
        return teacher;
    }

    public void setTeacher(Tecaher teacher) {
        this.teacher = teacher;
    }
}
