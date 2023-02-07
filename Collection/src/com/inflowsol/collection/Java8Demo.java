package com.inflowsol.collection;

import java.util.Arrays;
import java.util.List;

public class Java8Demo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("umesh","sumesh","depapap");
        list.forEach(i-> System.out.println(i));
        list.forEach(System.out::println);

        list.stream().filter(i->{
            System.out.println("hii");
            return true;
        });
        }
    }

