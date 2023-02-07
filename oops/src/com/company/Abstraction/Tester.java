package com.company.Abstraction;

public class Tester {
    public static void main(String[] args) {
        /*Oneplus oneplus=new Oneplus();
        oneplus.barnd();
         oneplus.Ram();*/
        Kindley kindley = new Kindley();
        Bisleri bisleri = new Bisleri();
        kindley.brand();
        kindley.capacity();
        kindley.type();
        kindley.color();
        System.out.println("..................................");
        bisleri.brand();
        bisleri.capacity();
        bisleri.type();
        bisleri.color();
    }
}
