package com.company.Encapsulation;

public class Bottle {
    private String brand;
    private int price;

    private double capacity;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCapacity(double capacity) {
         this.capacity = capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
