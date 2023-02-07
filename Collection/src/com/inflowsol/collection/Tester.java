package com.inflowsol.collection;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList();
        list.add(new Employee("sumesh",3,188.8, (byte) 24));
        list.add(new Employee("mahesh",4,165.6,(byte)77));
        Collections.sort(list);
        for (Employee e:list) {
            System.out.println(list);

        }
    }
}
