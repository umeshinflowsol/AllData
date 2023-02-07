package com.company.Abstraction;

public class Kindley implements Bottle {
    @Override
    public void brand() {
        System.out.println("brand:kindley");
    }

    @Override
    public void type() {
        System.out.println("type:waterbottle");
    }

    @Override
    public void capacity() {
        System.out.println("capacoity:10leter");

    }

    @Override
    public void color() {
        System.out.println("color:red");
    }
}
