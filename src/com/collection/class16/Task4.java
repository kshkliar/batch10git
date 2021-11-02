package com.collection.class16;

public class Task4 {
    public static void main(String[] args) {
        //5. How would you reverse a String word by word?
        String str="This is a sentence that i want to reverse";
        String[] arr=str.split(" ");
        StringBuilder reversed= new StringBuilder();
        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s); //converting String to StringBuilder
            stringBuilder.reverse(); // reverses the String
            reversed.append(stringBuilder).append(" "); // same as concat
        }

        System.out.println(reversed);

    }
}
