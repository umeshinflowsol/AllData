package com.inflowsol.collection.Set.treeset;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetDescendingOrderExample {
    public static void main(String[] args) {
        // Creating a TreeSet with a custom Comparator (Descending  Order)
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
    }
}
