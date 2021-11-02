package com.syntax.class03;

public class MoreIfExamples {

    public static void main(String[] args) {

        double a = 20;
        double b = 20;

        if (a == b) { //condition always must be a boolean value
            System.out.println("Numbers are equal");
            System.out.println("My numbers are twins");

        } else {
            System.out.println("Numbers are not equal");
            System.out.println("Numbers are not twins");
            System.out.println("I am else block code");
        }

        System.out.println("-----------------------------------------------");

        /*
         * if it is a break time --> I will get a coffee
         * 							otherwise I will focus on the class
         */
        boolean isBreakTime = true;

        if (isBreakTime) {
            System.out.println("I am getting my coffee");
        } else {
            System.out.println("I am focusing on the class");
        }

        /*
         *  if you are hungry --> I will go eat
         *  				otherwise: I will go have a tea
         */

        boolean isHungry = false;

        if (isHungry) {
            System.out.println("I will go eat");
        } else {
            System.out.println("I will go have a tea");
        }
    }           // BREAK TILL 1:45
}
				