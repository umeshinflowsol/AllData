package com.inflow.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
/*
@ComponentScan(basePackages = "com.inflow.SpringDemo")
*/
@PropertySource("classpath:META-INF/employee-info.properties")
public class OrganizationConfig {

    @Bean()
    //employeeBean is going to be Bean id
    //doing Dependency injection
    public  Employee  employeeBean(){

       Employee employee=  new Employee(departmentBean());
       employee.setDepartment(departmentBean());
       return employee;
    }

    @Bean()
    public  Department departmentBean(){
        return new Department();
    }
}
