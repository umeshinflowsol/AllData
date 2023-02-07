package com.company.Abstraction;

public class Bisleri implements Bottle{
    @Override
    public void brand() {
        System.out.println("brand:Bisleri");
    }

    @Override
    public void type() {
        System.out.println("type:waterbottle");
    }

    @Override
    public void capacity() {
        System.out.println("capacoity:20leter");

    }

    @Override
    public void color() {
        System.out.println("color:white");
    }
}
