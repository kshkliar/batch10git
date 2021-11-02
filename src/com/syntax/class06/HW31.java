package com.syntax.class06;

import java.util.Scanner;

public class HW31 {

    public static void main(String[] args) {
        Scanner s;
        int num1, num2, num3, largest;
        s = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();

        if (!(num1 == num2 && num2 == num3)) {

            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
            // assuming num1 is larger than num2
        } else { //num2 is larger than num1 num2>num1
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }


        }
        System.out.println("The largerst number is "+ largest);
    }
}