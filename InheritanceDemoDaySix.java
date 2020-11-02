package com.javabasics;

public class InheritanceDemoDaySix {
    // super - sub
    // base - derived
    // parent - child

    public static void main(String[] args) {
//        Sample sample = new Sample();

//        SubClass subClass1 = new SubClass();
//
//        SuperClass superClass1 = new SuperClass();
//        System.out.println( superClass1.getClass());
//        com.javabasics.SuperClass -> fully qualified class name
//        superClass1.getNameOfClass();


        //SubClass subClassReference = new SubClass();
        // subClass1 will have access to everything (well, not everything) from super class and everything from subclass


        //SuperClass superClassReference = new SuperClass(); // only everything from the SuperClass

        // polymorphism -> one object different ways to invoke
        SuperClass superClassReference2 = new SubClass();
        superClassReference2.getNameOfClass();
        //superClassReference2.sampleMethod();

        










    }


}

class SuperClass {

    public SuperClass() {
        System.out.println("I am a SuperClass constructor and I am being invoked");
    }


    // encapsulation
    private int var1;

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void getNameOfClass() {
        System.out.println("I am from SuperClass");
    }
}

class SubClass extends SuperClass {

    SubClass() {
        super();
        System.out.println("I am a SubClass constructor and I am being invoked");
    }


    // method overriding in java
    @Override
    public void getNameOfClass() {
        System.out.println("I am from SubClass");
    }


    public void sampleMethod(){
        System.out.println("I am a sample Method: " + getClass());
    }



}

class Sample {
    Sample() {
        System.out.println("I am a Sample Class constructor being invoked.");
    }
}
