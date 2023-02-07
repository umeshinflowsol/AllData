package com.inflowsol.collection;

public class Employee implements Comparable<Employee> {
   private String name;
   private int Id;
   private double height;
   private byte age;

    public Employee(String name, int id, double height, byte age) {
        this.name = name;
        Id = id;
        this.height = height;
        this.age = age;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        if (Id == e.Id) {
            return 0;
        }else if (Id>e.Id) {
            return 1;

        }else{
            return -1;
        }
    }
}
