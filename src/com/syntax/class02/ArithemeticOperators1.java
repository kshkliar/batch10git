package com.syntax.class02;

public class ArithemeticOperators1 {

    public static void main(String[] args) {

        /*
         *  +, -, *, /, %
         */

       int num1=90;
       int num2=10;


        System.out.println(num1+num2);//100
        System.out.println(num1-num2);//80
        System.out.println(num1*num2);//900
        System.out.println(num1/num2);//9

        int sum = num1+ num2;
        System.out.println(sum);//100

        int sub=num1-num2;
        System.out.println(sub);//80

        double n1=2.99;
        double n2=3.05;

        double total =n1+n2;
        System.out.println(total);

        double resultOfDivision=n1/n2;
        System.out.println(resultOfDivision);


        float f1=2.99f;
        float f2=3.05f;
        float floatDivision=f1/f2;
        System.out.println(floatDivision);

        //modulus%

        int number1, number2, mod;

        number1=20;
        number2=6;
        mod =number1%number2;
        System.out.println(mod);// остаток в результате деления

        int guess; //declare a variable
        guess= 20+20*2; //assign the value to variable guess
        System.out.println(guess);
        guess = 2*2+(4+12); //reassign the value to variable guess
        System.out.println(guess);//20
    }
}
