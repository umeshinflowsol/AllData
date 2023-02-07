package com.company;
public class Main {
    private int price;
    private String name;
    private float weight;

    public Main() {

    }
    public Main(int price,String name,float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Main{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

