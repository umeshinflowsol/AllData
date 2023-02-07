package com.company.Singleton;

public class Tester {
    public static void main(String[] args) {

        Service service = Service.getService();
        Service service1 = Service.getService();
        Service service2 = Service.getService();

        System.out.println(service.hashCode());
        System.out.println(service1.hashCode());
        System.out.println(service2.hashCode());


    }
}
