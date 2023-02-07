package com.company.exception;

public class BankOperation {

   int arry[]={10,20,30};

   void readArray()
   {
       try {
           for (int index = 0; index <=arry.length; index++) {
               System.out.println(arry[index]);
           }
       }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
       {
           arrayIndexOutOfBoundsException.printStackTrace();
       }
       System.out.println("working on arry");

   }


}