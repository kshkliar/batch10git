package com.syntax.class02;

public class AddingOrConcatenating {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        int c = 10;
        int d = 20;

        System.out.println("1" + 2 + 3);//1 + 2 -> "12" + 3 -> "123"

        System.out.println(1 + 2 + "3");//"33"

        System.out.println(c + d + a + b); // 30HelloWorld
        System.out.println(a + c + b + d); //Hello10World20
        System.out.println(a + (c + d) + b); //Hello30World
        System.out.println(a + c + d + b); // Hello1020World

        System.out.println(a + b + c + d);

        String combined = a + b + c + d;
        System.out.println(combined);

        char grade = 'A';

        String str = "Student";

        String newString = grade + " " + str;
        System.out.println(newString);

    }
}
