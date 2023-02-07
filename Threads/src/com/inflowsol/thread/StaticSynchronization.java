package com.inflowsol.thread;

public class StaticSynchronization {

    public synchronized void display(String text) {
        System.out.println("Welcome " + text);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting " + text);
    }
    }

