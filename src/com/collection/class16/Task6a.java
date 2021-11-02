package com.collection.class16;

public class Task6a {
    public static void main(String[] args) {
        //7. How would you swap  2 strings without a temporary variable?
       String str="String one";
       String str2="String two";
        str = str + str2; //String oneString two
        System.out.println(str);
        System.out.println("----------------------------------------");
        str2=str.substring(0,str.length()-str2.length());
        System.out.println(str2);
        System.out.println("---------------------------------------");
       str =str.substring(str2.length()); //12:15
        System.out.println(str);
        System.out.println(str2);
    }
}
