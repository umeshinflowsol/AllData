package com.inflowsol.thread;

public class Demo extends Thread{

    public synchronized void run(){
        for(int i=0;i<10;i++)
        {
            System.out.print(i+"  ");
        }
    }
}
