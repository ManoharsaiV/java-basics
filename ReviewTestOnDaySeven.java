package com.javabasics;

/** MAY THE FORCE BE WITH YOU!!!! */

public class ReviewTestOnDaySeven {


   /* define a instance variable with variable name 'sampleInstanceVariable'
     of type 'char'.*/

    /* define a static variable with variable name 'sampleStaticVariable'
     of type 'float'.*/

    public static void sampleTestMethodOne() {
        // print the above declared variables

    }


    // define a no-arg constructor for this class i.e, 'ReviewTestOnDaySeven'



    /* define a parametrized constructor for this class i.e, 'ReviewTestOnDaySeven'
     which takes the above a variable of type 'char'.
     now, inside the constructor, initialise the above defined instance variable
     'sampleInstanceVariable' with the value from the parametrized constructor
     hint -> use 'this' keyword
     */


    /* define a static method which takes a variable of type 'int'
     and the method should return the square of the given number
     invoke the method in the main method taking '9999999' as input
     and print the result
     hint -> take care of the result's range
    */


   /*  define a instance method which takes a variable of type 'String' and
     also a variable of type 'char'
     the method should return the number of occurrences of the given char in the given string
     taking "GEEKSFORGEEKS" and 'E' as input, invoke the method in the main method
     and print the result
     hint -> try to iterate through each character of the given string and
     check if it matches with the given character
     */



    /* what do you think is the output of this method?
     what is s1 == s2 and what is s2 == s3
     would the flow of execution be different if '&' used instead of "&&"
      explain your answer in a one line comment */
    public static boolean sampleTestMethodTwo() {
        String s1 = new String("Java is fun!");
        String s2 = "Java is fun!";
        String s3 = "Java is fun!";
        return s1 == s2 && s2 == s3;
    }


    // what would be the output of the following method?
    // please don't invoke this method and the above method..
    public static boolean sampleTestMethodThree(){
        String s1 = "Java is super fun!";
        String s2 = "Java is super fun!";
        return s1.equals(s2);
    }

    // complete the following method and invoke the method in the main method
    public static void sampleTestMethodFour(){
        // use 'Scanner' class to access input from the user

        // write code assuming the input from the user is just a String

        // print the user entered string to the display


        // finally close the Scanner class's object.

    }

    // please complete the method and invoke it in the main method.
    public static float[] sampleTestMethodFive(){
        // create a 1-D array of type 'float' with size '5'

        // fill the array with some sample values.


        // print the array's length using the 'length' literal

        // finally, return the array
        return null;

    }


    // please visit till the EOF (end of the file) before completing this method
    // do not invoke this method in the main method.
    public static void sampleTestMethodSix(){
        SuperTestClass superTestClassReference = new SuperTestClass();
        superTestClassReference.returnA(); // what is the output?
        // create an object for 'SubTestClass' with its own reference

        // create an object for 'SubTestClass' with 'SuperTestClass' reference


    }

    // invoke respective methods which are instructed to be invoked
    public static void main(String[] args) {

    }




}

class SuperTestClass{
    int a;

    public int returnA(){
        return this.a;
    }

    public void methodOne(){
        System.out.println(getClass());
    }

}

// create a class with name 'SubTestClass' which inherits 'SuperTestClass'
// override the methodOne() from the SuperTestClass in SubTestClass
// define a new method 'methodTwo' whose return value is void.




