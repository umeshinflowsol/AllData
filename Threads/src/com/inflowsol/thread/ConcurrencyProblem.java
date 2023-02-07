package com.inflowsol.thread;

public class ConcurrencyProblem extends Thread {
    public static int salary=0;
    public static void main(String[] args) {
        ConcurrencyProblem thread=new ConcurrencyProblem();
        thread.start();
        //for checking thread has finished its running
        while(thread.isAlive()){
            System.out.println("waiting.......");
        }
        System.out.println("ConcurrencyProblem:"+salary);
        salary++;
        System.out.println("ConcurrencyProblem:"+salary);
    }
    public void run(){
        salary++;
    }

}
