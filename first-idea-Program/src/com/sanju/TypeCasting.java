package com.sanju;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // Type casting

        int num = (int)(233.234f);
        System.out.println(num);

        // automatic type promotion i expressions

//        int a = -1;
//        byte b = (byte)(a);
//
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//
//        int d = a * b / c;

//        System.out.println(d);

//        byte d =  70;
//        int b = (int) (b *2);

////        int a = 'A';
//        System.out.println("你好");

        // How many Time promotion rules

//        System.out.println( 3 *12);

        byte b = 2;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 34.4f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " +(i / c) + " " + (d * s));
        System.out.println(result);






    }
}
