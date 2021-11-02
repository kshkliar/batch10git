package com.syntax.class02;

public class ShorthandOperators {

    public static void main(String[] args) {

        int num = 20;
        num = num + 100;

        System.out.println(num);

        num = num - 60;
        System.out.println(num);

        int number = 100;
        number += 100; //number=number+100

        System.out.println(number);

        number -= 30; //number =number-30
        System.out.println(number); //170

        number /= 10;
        System.out.println(number); //17

        number *= 2;
        System.out.println(number);

        int num1 = 3;
        int num2 = 7;
        int num3 = 5;
        int num4 = 1;
        int add = num1 + num2;
        int divide = add / num3;
        int result = divide - num4;
        System.out.println("The result of arithmetic operation is equal to " + result);

        int myNumber = 5;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println("The magic number is " + stepSix);

    }
}
