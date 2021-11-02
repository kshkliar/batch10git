package com.syntax.class03;

public class WhatHappens {

    public static void main(String[] args) { //BREAK TILL 11:30

        // int i=1.99; error

        int i = (int) 1.99; //narrowing or explicit casting
        System.out.println(i);

        double d = 100; //widening or implicit casting
        System.out.println(d); //100.0

        byte b = (byte) 128; //narrowing
        System.out.println(b);

        int num = 20;
        int num1 = 3;

        System.out.println(num / num1);//we divide 2 int values and they do not have decimals

        double num2 = 20;
        double num3 = 3;//conversion from int to double happens

        System.out.println(num2 / num3); //dividing 2 double value

        float f = 10.99f;
        double number = 10.99;

        int t = 100;

        int n1 = 20;
        int n2 = 3;
        double dd = n1 / n2; //we divide 2 int values and only then result are storing in the double type
        System.out.println(dd);//6.0
    }
}
