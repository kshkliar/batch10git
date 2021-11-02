package com.syntax.class01;

public class PracticeVariables1 {
    public static void main(String[] args) {


        byte variable =127;
        short variabl=32767;
        int var3 =10000; //most popular to represent whole number
        long var4 =100000;

        //storing number with decimals
        float myFloat= 10.99f;
        double myDouble=100.99;
        double myDoubly=1008899;


        //storing single character
        char singleLetter= 'J';
        char specialCharacter='%';
        //store boolean values: yes or no
        boolean myBoo= true;
        boolean myBoo2=false;
        System.out.println(variable);
        System.out.println("variable");

        System.out.println(myBoo);

        boolean myBoo1=true;
        System.out.println(myBoo1);
        System.out.println(myDoubly);
        int myNumber=100;
        System.out.println(myNumber);

        int age= 22;
        System.out.println(age);
        //boolean myNumber=true; --> error saying duplicate variable

        age =23; // reassign the value
        char letter='A';//declare
        letter='B'; //reassign
        System.out.println(letter);
    }
}
