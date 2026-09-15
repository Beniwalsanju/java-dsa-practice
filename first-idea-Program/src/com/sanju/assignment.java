package com.sanju;


import java.util.Scanner;

    // Input a year and find whether it is a leap year or not.

public class assignment {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");

        int year = input.nextInt();

        if (year % 400 == 0){
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 ==0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap year");
          }

        // Take two numbers and print the sum of both.

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);

    }
}