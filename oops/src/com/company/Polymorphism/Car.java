package com.company.Polymorphism;

public class Car {

    public void Brand(String name) {
        System.out.println("car Brand:" + name);
    }

    public void moduletype(String module, int number) {
        System.out.println("moduletype:" + module);
        System.out.println("number" + number);
    }
}

class Maruti extends Car {
    @Override
    public void Brand(String name) {
        System.out.println("car Brand:" + name);
    }

    @Override
    public void moduletype(String module, int number) {
        System.out.println("moduletype:" + module);
        System.out.println("number:" + number);
    }
}
