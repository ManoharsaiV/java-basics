package com.javabasics;

public class DayThreeCode {


    public static void shortHandLogicalAnd() {
        int var1 = 2, var2 = 3;
        boolean va = (var1 != 2) && (var2++ == var2);
        System.out.println(va);
        System.out.println("var1:" + var1);
        System.out.println("var2:" + var2);
    }


    public void instanceMethod() {
        x = 555;
        y = 666;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }


    // variable shadowing

    int x = 10; // instance variable
    int y = 11;

    public int variableShadowingDemo(int x, int y) {
        System.out.println(y); // 80
        System.out.println(x); // 40
        System.out.println("this.x" + " " + this.x); //
        System.out.println("this.y" + " " + this.y); //
        //x = this.x; //
        return x;
    }




    // arrays in java
    public static void arraysDemo() {
        // array is a data structure in java
        // data structure is how we store data
        // store where? memory
        // there are many data structures out there
        // linear, hierarchical
        // array is one such data structure which is linear
        // what is linear? memory is allocated continuously
        // what do you mean by continuous?
        // contiguous
        // how do we create an array in java?
        // syntax
        // dataType[] arrayName = new dataType[sizeOfTheArray];
        // sizeOfTheArray -> should be specified at the array declaration and initialization
        // array is an object in java

        int[] arr1 = new int[10];

        // how to enter elements into an array
        // array's index start with 0
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        // print the array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        System.out.println();

        System.out.println(arr1.length);
        // 2-d array
        int[][] arr2 = new int[10][10];
        System.out.println(arr2.length); // 10

        // array of arrays
        for (int row = 0; row < arr2.length; row++) {
            for (int column = 0; column < arr2[row].length; column++) {
                System.out.print(arr2[row][column] + " ");
            }
            System.out.println();

        }


        System.out.println();
        // 3d array
        int[][][] arr3 = new int[5][5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[j].length; k++) {
                    //System.out.print(arr3[i][j][k] + " " + "i: " + i + " " +  "j: " + j + "k: " + k);
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(arr1.length); // 10
        System.out.println(arr2.length * arr2[0].length); // 100
        System.out.println(arr3.length * arr3[0].length * arr3[0][0].length); // 125


    }
    public static void main(String[] args) {
        //shortHandLogicalAnd();
        DayThreeCode obj1 = new DayThreeCode();
        DayThreeCode obj2 = new DayThreeCode();
        /*obj1.x = 25;
        obj1.y = 50;
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj2.x);
        System.out.println(obj2.y);*/
//        obj1.instanceMethod();
//        obj2.instanceMethod();

        // obj1.instanceMethod();
/*
        System.out.println("obj1.x:" + obj1.x);
        System.out.println("obj2.x:" + obj2.x);*/


        //obj1.variableShadowingDemo(40, 80);
        //arraysDemo();


    }



}
