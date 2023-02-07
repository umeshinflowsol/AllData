package com.inflowsol.thread;

public class PriorirtyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("run() starting of run method......");
    }

    public static void main(String[] args) {
        PriorirtyThread priorirtyThread=new PriorirtyThread();
        PriorirtyThread priorirtyThread1=new PriorirtyThread();
        PriorirtyThread priorirtyThread3=new PriorirtyThread();

        System.out.println("priority of thread :"+priorirtyThread.getPriority());
        System.out.println("priority of thread 1:"+priorirtyThread1.getPriority());
        System.out.println("priority of thread 3:"+priorirtyThread3.getPriority());

        priorirtyThread.setPriority(6);
        priorirtyThread1.setPriority(5);
        priorirtyThread3.setPriority(7);
        System.out.println("after seting new priority values are as follows");

        System.out.println("priority of thread :"+priorirtyThread.getPriority());
        System.out.println("priority of thread 1:"+priorirtyThread1.getPriority());
        System.out.println("priority of thread 3:"+priorirtyThread3.getPriority());

    }

}
