package com.inflowsol.thread;

public class Mythread extends  Thread{
    private String text;
    StaticSynchronization d;

     Mythread(String text, StaticSynchronization d) {
        this.text = text;
        this.d = d;
    }
    public void run() {
        d.display(text);
    }
}
