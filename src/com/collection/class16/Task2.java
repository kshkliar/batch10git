package com.collection.class16;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters,
         numbers and special characters. Find out how many alpha
         characters are there in the String.
         */
        //To format the code CTRL+ALT+L for windows
        //To format the code CMD+ALT+L  for mac
        String str="ajfaASDFR1234!@#$%^";
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
        //.length() is a method from the String class thats why we need ()

    }
}
