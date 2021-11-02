package com.syntax.class03;

public class IfStatementDemo {

    public static void main(String[] args) {

        int num1 = 112;
        int num2 = 200;

        if (num1 > num2) { //if block executes only when condition is true
            System.out.println("num1 " + num1 + "is larger than num2 " + num2);
        }

        System.out.println(" -------------------- ");

        double money = 100;
        double $priceCookies = 15.99;

        if (money > $priceCookies) {
            System.out.println("I am buying those cookies");
        }

        System.out.println("End of my code !");

    }
}
