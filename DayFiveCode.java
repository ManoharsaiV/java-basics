package com.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class DayFiveCode {

    private static int x = 2;


    public static char findCharAtIndex(String string, int i) {
        if (i < string.length() && i >= 0) {
            return string.charAt(i);
        }
        return (char) -1;
    }

    // how to access input in java
    public static void accessingInputInJava() {
        // for a very basic use -> we use Scanner class in java
        // syntax -> ClassName objectName = new ClassName();
        System.out.println("Please enter the input text");
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine(); // reads the entire line
        //String input2 = scanner.next(); // reads till the first white-space
        //System.out.println(input2);
        //int input3 = scanner.nextInt();
        //System.out.println(input3);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        System.out.println(Arrays.toString(inputArr));
        int x = Integer.parseInt(inputArr[0]);
        int y = Integer.parseInt(inputArr[1]);
        System.out.println("x:" + x);
        System.out.println("y:" + y);


        scanner.close();


    }



    public static void main(String[] args) {
//        System.out.println(findCharAtIndex("manohar", -1));
        accessingInputInJava();
    }


}
