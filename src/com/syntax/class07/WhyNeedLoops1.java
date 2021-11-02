package com.syntax.class07;

public class WhyNeedLoops1 {

    public static void main(String[] args) {

        //I want to say hi 4 times

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        int a = 1;
        System.out.println("-----Hello using if statement--------");
        if (a < 4) {
            System.out.println("Hello");
        }
        System.out.println("------Hello using while loop------");

        while (a <= 4) {
            System.out.println("Hello");
            a++;
        }

//		for (; ; );
		
		/* EXAMPLE OF INFINITE LOOP
		 * 
		 * while(a<=4) {
			System.out.println("Hello");
		}
		 */


    }
}
