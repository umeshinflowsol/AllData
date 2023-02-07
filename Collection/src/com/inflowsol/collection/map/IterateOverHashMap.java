package com.inflowsol.collection.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);
        System.out.println("==iterating over hasmap===");
        Set<Map.Entry<String, Double>> doubleEntry = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = doubleEntry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
        for (Map.Entry<String, Double> entry:employeeSalary.entrySet()) {
            System.out.println(employeeSalary.values()+"" +employeeSalary.keySet());
        }
    }

}

