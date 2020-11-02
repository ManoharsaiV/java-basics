package com.javabasics;

public class DayTwoCode {

    // type casting
    // primitive casting and object type casting
    // type casting -> implicit and explicit
    // implicit -> jvm does that for you
    //
    public static void typeCasting() {
        // explicit
        int a = 10;
        short s = (short) a;
        System.out.println(s);
        a = Integer.MAX_VALUE;
        System.out.println(a);
        s = (short) a;
        System.out.println(s);
        // char is internally -> an unsigned int
        char ch = 'a'; // unicode
        System.out.println(ch);
        byte b = (byte) ch;
        System.out.println(b);
        // anything to char is explicit casting
        s = 1333;
        ch = (char) s;
        System.out.println(ch);
        int ic;
        ic = ch;
        System.out.println(ic);


        // implicit
        int ac = 22;
        float f;
        //f = (float) ac;
        f = ac;
        System.out.println(f);


        // double
        // by default, any floating point integer is double in java
        double dd = 12.7;
        float ff = (float) 12.7;
        ff = 13.7f;
    }


    // bitwise operators
    public static void bitwiseOperators() {
        // logical and
        int a = 10, b = 10;
        int bitWiseAnd = a & b;
        System.out.println(bitWiseAnd);
        int xxxxxx = a | b;
        System.out.println(xxxxxx);
        int bitWiseXor = a ^ b;
        System.out.println(bitWiseXor);
        a = 5;
        b = 7;
        System.out.println(a ^ b);
        int bitWiseComplement = ~a;
        // how?
        // msb -> sign
        // 1's complement(remaining bits) + 1 -> 2's complement
        // 0101 -> 1010
        // 101
        //   1
        // 110
        System.out.println(bitWiseComplement);

        // short-hand operators
        //  short-hand &&
        boolean b1 = false, b2 = true;
        System.out.println(b1 && b2);

        int aaaa = 11, bbbb = 15;
        // logical and
        boolean result = (aaaa == 11) && (bbbb == (aaaa + 1));



        // logical OR ||
        boolean bool1 = false, bool2 = true;
        System.out.println(bool1 || bool2);

        // left shift
        System.out.println(5 << 2); // 5 * 2^2

        // right shift
        System.out.println(5 >> 2); // 5/(2^2)


    }

    public static void main(String[] args) {
        //typeCasting();
        bitwiseOperators();
        //increDecre();

    }


    // post increment/decre and pre incre/decre
    public static void increDecre() {
        // post-increment
        int i = 10;
        System.out.println("i:" + i); // 10
        System.out.println(i++); // 10
        System.out.println("i:" + i); // 1

        int j = 20;
        j = j + 1;
        System.out.println(j); // 21
        j += 1;
        System.out.println(j); // 22

        // pre increment
        int k = 40;
        System.out.println(++k); // 41
        System.out.println(k); // 41

        // initialization; conditionCheck; increment/decrement
        int l = 0;
        for (; l < 10; l++) {
            System.out.print(l + " ");

        }
        System.out.println();

        // post decrement
        int x = 5;
        System.out.println(x--); // 5
        System.out.println(x); // 4

        // pre decrement
        int y = 35;
        System.out.println(--y); // 34
        System.out.println(y);// 34

        y -= 1;
        System.out.println(y);

    }


}
