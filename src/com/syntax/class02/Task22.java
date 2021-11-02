package com.syntax.class02;

public class Task22 {

    public static void main(String[] args) {

        /*
         * Write a Java program to add, subtract, multiply and divide 2 decimal values.
         * Your program should say. "The _______ of 2 numbers ___ and ___ is equal to
         * _____"
         */

        double num1, num2, result;
        num1 = 7.66;
        num2 = 8.77;
        result = num1 + num2;
        String act = "add";
        System.out.println("The " + act + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + result);

        result = num1 * num2;
        act = "multiply";
        System.out.println("The " + act + " of two numbers " + num1 + " and " + num2 + " is equal to " + result);

        result = num1 / num2;
        act = "divide";
        System.out.println("The " + act + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + result);


        /*
         * Write a program to find the square of the number 3.9. You program should say
         * “The square of the ____ is ____ “
         */

        double num = 3.5;
        double square = 3.9 * 3.5;
        System.out.println("The square of the " + num + " is " + square);


        /*
         * Write a program to print the area and perimeter of a rectangle with width = 5
         * and height = 8. Your program should say. “The perimeter of a rectangle with
         * width ___ and height ____ is equal to _____ and the area is __”
         *
         */

        int width = 45;
        int height = 2;
        int perimeter = 2 * (width + height);
        int area = width * height;
        System.out.println("The perimeter of a rectangle with width " + width + " and height" +
                height + " is equal to " + perimeter + " and the are is " + area);


    }
}
