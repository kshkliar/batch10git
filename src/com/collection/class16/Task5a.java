package com.collection.class16;

public class Task5a {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not?
   String str="aba";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("polindrome");

        }else{
            System.out.println("Not polindrome");
        }





        //12:15
    }
}
