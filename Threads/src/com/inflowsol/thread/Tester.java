package com.inflowsol.thread;

public class Tester {
    public static void main(String[] args) {
      /* Demo demo=new Demo();
        demo.start();
        Demo demo1=new Demo();
        demo1.start();
        Demo demo2=new Demo();
        demo2.start();
       // DemoRunnable demoRunnable= new DemoRunnable();
      Thread thread=new Thread(demoRunnable);
      thread.start();
        Synchronized aSynchronized=new Synchronized();
        Mythread1 mythread1=new Mythread1(aSynchronized);
        Mythread2 mythread2=new Mythread2(aSynchronized);
        mythread1.start();
        mythread2.start();*/
        StaticSynchronization s=new StaticSynchronization();
        Mythread mythread=new Mythread("java",s);
        Mythread mythread1=new Mythread("python",s);
        mythread.start();
        mythread1.start();
    }
}
