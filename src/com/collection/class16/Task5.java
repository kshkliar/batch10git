package com.collection.class16;

public class Task5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not?
        String str="aba";
        String reversed= new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }

        //12:15
    }
}
