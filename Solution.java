package com.srinivas;


import com.javabasics.AccessModifiersDemoDayFive;

public class Solution {

    // everything in java stays in a class

    // statically typed

    // data types in java -> primitives
    // when you're defining a variable
    // datatype variableName = value;
    boolean x;
    int integerVariable = 10;
    float aFloat = 11.5f; // instance variable
    byte b = 2;
    short aShort = 10;
    char aChar = 'a'; // single quote
    long aLong = 111;
    double aDouble = 123.4;
    boolean aBoolean = true;

    static int staticVariable = 11;


    // keywords in java
    // which has a proper definition
    //

    // methods in java

    // accessModifier+ methodReturnType  methodName(){  }
    // method definition
    // static -> class specific
    public static void methodNameOne() {
        System.out.println("static method");
    }

    // method definition
    // instance -> object specific
    public void methodNameTwo() {
        System.out.println("instance method");
    }

    // static -> can be used inside static, instance
    // instance -> can be used in instance with out any need for object
    // but if you want to use inside static, you will need an object
    // static in static -> cool
    // static in instance -> cool
    // instance in instance -> chill bro
    // instance in static -> you will need an object of the underlying class
    public void methodNameThree() {
        methodNameOne();
        methodNameTwo();
        return;
    }


    // sieve of erasthones
    public static boolean checkIfPrime(int number){
        int countFactors = 0;
        /*for(int i = 1; i <= number; i++){
            if(number % i == 0){
                countFactors++;
            }
        }*/
        boolean result = false;

        int index = 1;
        while(index <= number/2){
            if(number % index == 0){
                countFactors++;
            }
            index++;
        }

        if(countFactors == 2){
            return true;
        }

        return false;
    }

    public static void loops(){

    }


    // methods with return type
    // variables defined inside a method has scope only inside that method
    public int methodWithReturnTypeOne(int a, int b) {
        int result = a + b;
        return result;
    }

    // method signature in java ?
    // method signature in java does not include a method's return type


    public static void main(String[] args) {
        // local variables
        int a = 10;
        // method invocation -> methodName();
        methodNameOne();
        // whenever you want to access an instance variable/method in
        // a static place -> I cannot do it directly
        // i need an object
        // which object?
        // object of the class which is holding those instance variables/methods
        // how do I get an object of that class?
        // what is new? new is a keyword in java
        // syntax -> ClassName objectName = new ClassName();
        Solution solutionObject = new Solution();
        solutionObject.methodNameTwo();

        // the right way to access any static variable/method is this way
        // ClassName.correspondingMethod/Variable
        Solution.methodNameOne();
        int mmamamma = solutionObject.methodWithReturnTypeOne(10, 20);
        System.out.println(mmamamma);

       boolean checkPrime = checkIfPrime(13);
       if(checkPrime){
           System.out.println("prime");
       }else{
           System.out.println("composite");
       }


    }


}


