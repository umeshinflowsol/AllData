package com.company.Singleton;

public class Service {

    private static Service service;

    private Service() {
        System.out.println("create singleton object");
    }

    public static Service getService() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }
}
