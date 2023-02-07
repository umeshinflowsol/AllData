package com.inflowsol.collection;
import java.util.List;

import java.util.ArrayList;

public class CreatingArrayListExample {

        public static void main(String[] args) {
            // Creating an ArrayList of String
            List<String> animals= new ArrayList<>();

            // Adding new elements to the ArrayList
            animals.add("Lion");
            animals.add("Tiger");
            animals.add("Cat");
            animals.add("Dog");

            System.out.println(animals);

            // Adding an element at a particular index in an ArrayList
            animals.add(2, "Elephant");
            animals.add("Lion");
            animals.add("Tiger");
            animals.add("Cat");
            animals.add("Dog");
            System.out.println(animals);

        }
    }

