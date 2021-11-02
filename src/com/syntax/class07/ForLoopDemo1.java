package com.syntax.class07;

public class ForLoopDemo1 {

    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            //jump
            System.out.print(" " + i);
        }
			/*
		 * for(initialization; condition; increment/decrement) {
		 *
		 * code to be repeated }
		}
	/*
		 * I want to say hello 5 times
		 */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        System.out.println("Want to print numbers from 1 to 10 ");

        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }
        System.out.println(" \nWant to print numbers from 20 to 10");


        for (int i=20;i>=10;i--){// i- starting point , i>10 - condition пока удовлетврояет
            //код исполняется  i--  условие;
            System.out.print(" "+ i);
        }
        System.out.println("\nWant to print even numbers from 10 to 100");
       for (int i=10;i<=100;i++) {
           if (i % 2 == 0) {
               System.out.print(" " + i);
           }
       }
        //task and break till 2 PM

    }
}
