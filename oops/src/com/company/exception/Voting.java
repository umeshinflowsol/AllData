package com.company.exception;

public class Voting {
  private   int age;



    public void setAge(int age) {
        this.age = age;
    }

    public void ageLimit(){
     if(age>18)
     {
    throw new NoteligiableException("not eligible for voting ");
     }
  }

}
