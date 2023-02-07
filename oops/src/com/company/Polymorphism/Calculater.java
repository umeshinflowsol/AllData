package com.company.Polymorphism;

public class Calculater {
    public int add(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public double add(int a, float b, byte c) {
        double sum = a + b - c;
        return sum;
    }
}
