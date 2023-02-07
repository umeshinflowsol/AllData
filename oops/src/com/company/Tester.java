package com.company;

public class Tester {
   public static void main(String[] array){
    Bottle bottle=new Bottle();
    bottle.setBrand("ummi");
    bottle.setPrice(100000);
    BottleOperation operation=new BottleOperation();
      operation.add(bottle);
       System.out.println(bottle.toString());
       operation.read();
   }
}

