package com.javabasics;

public class DayFourCode {


    // default constructor
    public DayFourCode() {
        System.out.println("default constructor is invoked");
    }

    // overloading

    public DayFourCode(int a) {
        System.out.println("parametrized constructor is invoked");
    }

    public DayFourCode(int a, int b) {
        System.out.println("*******");
    }

    public DayFourCode(int a, int b, int... c) {
        System.out.println("this is a var-args constructor");
    }


    // method overloading in java
    public int add(int a, int b) {
        System.out.println("normal method invoked");
        return a + b;
    }

    public int add(int... c) {
        System.out.println("var-arg invoked");
        int result = 0;
        for (int i = 0; i < c.length; i++) {
            result += c[i];
        }

        return result;

    }

   /* public int add(int[] a){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }*/

    public int add(double a, double b) {
        return (int) (a + b);
    }



    public static void main(String[] args) {

        DayFourCode dayFourCode1 = new DayFourCode();
       /* DayFourCode dayFourCode2 = new DayFourCode(10);
        DayFourCode dayFourCode3 = new DayFourCode(10,20);
        DayFourCode dayFourCode4 = new DayFourCode(10,20, 30,40,50,60);*/

        //dayFourCode1.add(1);
        int result = dayFourCode1.add(10,20);
        System.out.println(result);

        System.out.println(dayFourCode1.add(1,2,3,4,5));



    }




}


