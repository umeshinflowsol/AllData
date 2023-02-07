package com.inflowsol.collection.Enum;

public class Runner {
    enum Mobiles
    {
        vivo,mi,oppo;
    }

    public static void main(String[] args) {
       Mobiles mobiles=Mobiles.vivo;

       switch (mobiles){
           case vivo:
               System.out.println("is the best");
               break;
           case mi:
               System.out.println("mi is worst");
           default:
               System.out.println("everything is good");
       }
    }
}
