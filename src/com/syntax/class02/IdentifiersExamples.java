package com.syntax.class02;

public class IdentifiersExamples {

    public static void main(String[] args) {

        //RULES:
        /*
         * Identifiers - name we give to classes, variables and methods
         * Keywords cannot be used as Identifiers
         * Identifiers cannot start with number
         * Identifiers cannot have with special character except: _ AND $
         */

        char singleletter = 'c';
        //boolean new=true; do not use keyword to name your variables

        //int 1num=100; //error
        int num1 = 100;

        boolean boo_ = true;
        double $price = 2.99;
        //byte ^b=1; --> error

        //Preferences:
        /* follow camel casing
         * Java Classes should start with upper case and follow camel casing
         * variables and methods in Java should start with lowercase and
         * follow camel casing
         */

        short thisIsMyShortNumber = 10;
        System.out.println(thisIsMyShortNumber);


    }

}
