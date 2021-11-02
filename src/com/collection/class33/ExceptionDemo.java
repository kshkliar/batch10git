package com.collection.class33;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        try{
            System.out.println(10/0);// if exeption - exwcute , if we do not get eror not execute next line of code( 10/0)
        }catch (Exception mike){// mike is just name of variable.
            System.out.println("This is not possible in java");
        }

        //Break till 12:55
        System.out.println("Line 1 after error");
        System.out.println("Line 2 after error");
        System.out.println("Line 3 after error");
        System.out.println("Line 4 after error");
        System.out.println("Line 5 after error");

    }
}
