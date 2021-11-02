package com.syntax.class04;

public class HW1 {

    public static void main(String[] args) {

        /*
         * Write a program to check whether number is positive or negative.
         */

        int num = 0;
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is " + num);
        }

        /*
         * Write a Java Program to check whether number is Even or Odd.
         */

        int evenorOdd = 15;
        if (evenorOdd % 2 == 0){
            System.out.println(evenorOdd+ " is an even number");
        }else {
            System.out.println(evenorOdd+ " is odd number");
        }

        /*
         *  reminder example
         */
int i=10/3;
        System.out.println(i);//3
int mod=10%3;
        System.out.println(mod);//1
    }
}
