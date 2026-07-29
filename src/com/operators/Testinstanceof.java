package com.operators;

// instanceof : Used to check whether the object reference variable
// refers to an object of a specified class or its superclass/interface.
public class Testinstanceof {

    public static void main(String[] args) {
        System.out.println("Main method started");

        Integer i1 = 10;

        System.out.println(i1 instanceof Integer); // true
        System.out.println(i1 instanceof Object);  // true
        //it is compile time error
       // System.out.println(i1 instanceof String);
        System.out.println(null instanceof Integer);//false
        Integer n1=100;
        System.out.println(n1 instanceof Integer);//true
    }
}
