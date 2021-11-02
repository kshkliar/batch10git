package com.syntax.class01;

public class VariableValues {

    public static void main(String[] args) {

     int myNumber=100;//declare variable and assingthe value
        char gender='W';
        int age=22; //declare variable and assing the value;
        //boolean myNumber=true;--> error saying duplicate variable

        System.out.println(myNumber);
        System.out.println(age);
        age=23; // reassign the value;
        System.out.println(age);

        char letter='A'; //declare
        letter='B'; //reassign;

        System.out.println(letter);


    }
}
