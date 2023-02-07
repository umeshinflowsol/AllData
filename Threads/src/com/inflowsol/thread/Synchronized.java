package com.inflowsol.thread;

public class Synchronized {

    public synchronized void printAmount(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class Mythread1 extends Thread{

    Synchronized s;
     public Mythread1() {

     }
      Mythread1(Synchronized s){
        this.s=s;
    }



     public void run(){
        s.printAmount(10);
    }
}

class Mythread2 extends Thread{
    Synchronized s;
    public Mythread2() {

    }
    Mythread2(Synchronized s){
        this.s=s;
    }
    public void run(){
        s.printAmount(100);
    }
}
