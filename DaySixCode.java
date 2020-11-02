package com.javabasics;

import java.util.Scanner;

public class DaySixCode {



    /*public static boolean checkIfContains(String s, char ch){
        if(s.indexOf(ch) != -1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        char[] ch = input[1].toCharArray();
        scanner.close();
        System.out.println(checkIfContains(input[0], ch[0]));
    }*/


    // encapsulation
    private int variable1;

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }




}
