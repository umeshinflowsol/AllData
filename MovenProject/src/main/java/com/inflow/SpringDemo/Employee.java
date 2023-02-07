package com.inflow.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
@Component("empBean")
*/
public class Employee {
    @Value("${emp.name}")
    private String name;


    public void setDepartment(Department department) {
        System.out.println("inside the setter method");
        this.department = department;
    }

    private Department department;

    public Employee(Department department) {
        this.department = department;
    }

    public void Display(){
        department.displayDepart("hello folkes");
        System.out.println("enterring into project"+""+ name);
    }
}
