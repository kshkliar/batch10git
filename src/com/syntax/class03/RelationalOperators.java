package com.syntax.class03;

public class RelationalOperators {

    public static void main(String[] args) {

        int num = 11;
        int num1 = 11;

        System.out.println(num > num1);
        System.out.println(num != num1);
        System.out.println(num < num1);
        System.out.println(num == num1);
        System.out.println(num >= num1);

        int a = 100;
        int b = 190;

        boolean boo = a < b;//result of the relational operators ALWAYS
        // a boolean value (true or false)
        System.out.println(boo);

        System.out.println(" ----------------------------  ");

        System.out.println(a == b); //checking for equality
        System.out.println(a = b); //reassigning value of var b to a

        System.out.println(a < b); //false
    }
}
