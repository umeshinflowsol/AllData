package com.inflowsol.collection;

import java.util.Comparator;
import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("umesh");
        vector.add("ramesh");
        vector.add("sumesh");
        vector.add("mahesh");


        // System.out.println("size:"+ vector.size()+""+vector);

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector);
    }
}
