package com.javabasics;

public class DayThreeConstructorDemo {


    public DayThreeConstructorDemo(int a) {
        a = 10;
        System.out.println("I am a parametrized constructor with parameter: " + a);
    }

    public DayThreeConstructorDemo() {
        System.out.println("I am a default no-arg constructor");
    }


    public static void main(String[] args) {

        DayThreeConstructorDemo dayThreeConstructorDemo2 = new DayThreeConstructorDemo(10);
        DayThreeConstructorDemo dayThreeConstructorDemo1 = new DayThreeConstructorDemo();
//        DayThreeConstructorDemo dayThreeConstructorDemo2 = new DayThreeConstructorDemo();
        //System.out.println(dayThreeConstructorDemo1.toString());
        // DayThreeConstructorDemo() we call it default constructor
        // what is a constructor?
        // a constructor is something which we use to create an instance of a class
        // a constructor is present inside a class


    }


}
