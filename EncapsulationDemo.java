package com.javabasics;

public class EncapsulationDemo {
    public static void main(String[] args) {
        DaySixCode daySixCode1 = new DaySixCode();
        System.out.println(daySixCode1.getVariable1());
        daySixCode1.setVariable1(11);
        System.out.println(daySixCode1.getVariable1());
        DaySixCode daySixCode2 = new DaySixCode();
        System.out.println(daySixCode2.getVariable1());


    }
}
