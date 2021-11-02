package com.syntax.class05;

public class LogicalAnd1 {

    public static void main(String[] args) {

        boolean understendJava = false;
        boolean enjoy = true;
        if (understendJava && enjoy) {
            System.out.println("That is awesome!");
        } else {
            System.out.println("Try more practice Java");
        }
        /*
         * declare a number if number is larger 1 AND smaller than 10 --> SMALL
         * if number is larger than 10 but smaller than 100 --> MEDIUM if number is
         * larger than 100 but smaller than 1000 -> Large otherwise numbers is huge
         */

        int num = 134564;
        if (num > 0) {
            if (num >= 1 && num < 10) {
                System.out.println(num + " is small number");
            } else if (num >= 10 && num < 100) {
                System.out.println(num + " is medium");
            } else if (num >= 100 && num< 1000){
                System.out.println(num + " is Large");
            }else{
                System.out.println(num + " is huge");
            }
        }

    }
}