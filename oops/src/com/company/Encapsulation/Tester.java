package com.company.Encapsulation;

public class Tester {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.setBrand("coco");
        bottle.setCapacity(14);
        bottle.setPrice(30);
        System.out.println(bottle.toString());
    }

}
