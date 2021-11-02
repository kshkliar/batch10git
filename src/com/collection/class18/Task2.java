package com.collection.class18;

public class Task2 {
    // Create a method that will take a String
    // as a parameter and returns reversed String.
// Method should be available to all classes within
// your project and accessible by class name.

    public static String reverse(String inputStr){
        /*StringBuilder stringBuilder=new StringBuilder(inputStr);
        stringBuilder.reverse();
        stringBuilder.toString();*/
        return new StringBuilder(inputStr).reverse().toString();
    }
}
