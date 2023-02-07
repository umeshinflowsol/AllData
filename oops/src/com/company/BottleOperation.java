package com.company;

public class BottleOperation {
    Bottle[] bottle=new Bottle[2];
    public void add(Bottle bottle1){
    int i=0;
        bottle[i]=bottle1;
        i++;
    }
    public void read(){
        for (int i = 0; i <bottle.length; i++) {
            if (bottle[i] !=null) {
                System.out.println(bottle[i].getBrand()+""+bottle[i].getPrice());

            }
        }
    }
}
