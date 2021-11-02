package com.collection.class16;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
4. How would you reverse a String character by character?
5. How would you reverse a String word by word?
6. How would you check if String is palindrome or not?
7. How would you swap  2 strings without a temporary variable?
         */

        String str="This is a sentence with spaces";
        System.out.println(str.replace(" ","")); // removes the spaces from the sentence
        System.out.println(str.replaceAll(" ","")); // removes the spaces from the sentence
        System.out.println(str.replaceAll("\\s","")); // removes the spaces from the sentence



    }
}
