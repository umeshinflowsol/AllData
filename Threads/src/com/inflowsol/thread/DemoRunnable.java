package com.inflowsol.thread;

public class DemoRunnable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println("starting the thread");
        }
    }
}
