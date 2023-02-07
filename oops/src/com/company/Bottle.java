package com.company;

public class Bottle {
    private String brand;
    private int price;

    public Bottle() {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }


}
