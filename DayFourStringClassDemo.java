package com.javabasics;

public class DayFourStringClassDemo {

    // String class in java
    public static void stringClassDemo() {
        // String string1 = new String("sample-string");
        // syntax
        // String objName  = "sampleStringLiteral";
        String sampleString = "RAVI"; // creation of a String object using a String literal
        System.out.println(sampleString.equals("ravi")); // false
        System.out.println(sampleString.charAt(0)); // 'R' -> returns a char
        System.out.println(sampleString.length());  // 4 -> returns an int
        String[] strArr = sampleString.split(""); // returns a String[]
        //System.out.println(Arrays.toString(strArr));
        //System.out.println(Arrays.toString(sampleString.toCharArray())); // returns a char[]
        sampleString.concat(" GOTETI"); // sampleString will have "RAVI" but not "RAVI GOTETI"
        // String class is immutable in java
        sampleString = sampleString.concat(" GOTETI");
        System.out.println(sampleString);

        String s1 = "RAVI GOTETI";
        String s2 = "RAVI GOTETI";
        System.out.println(s1.equals(s2)); // true
        // checks for object references
        // what do you mean by object references?
        // that means, if both the objects s1 and s2 are referring to the same object
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = new String("RAVI GOTETI");
        System.out.println(s3.equals(s2)); // true
        System.out.println(s3 == s2); // false

    }

    public static void main(String[] args) {
        stringClassDemo();
    }


}
