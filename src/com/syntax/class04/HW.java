package com.syntax.class04;

public class HW {

	public static void main(String[] args) {

		/*
		 * Write a program to check whether number is positive or negative.
		 */

		int number = 0;

		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println("Your number is " + number);
		}

		/*
		 * Write a Java Program to check whether number is Even or Odd.
		 */

		int evenOdd = 16;
		
		if (evenOdd % 2 == 0) {
			System.out.println(evenOdd + " is an even number");
		} else {
			System.out.println(evenOdd + " is an odd number");
		}
		
		/*
		 *  reminder example
		 */
		
		
		int i=10/3;
		System.out.println(i); //3
		
		int mod=10%3;
		System.out.println(mod); //1
				

	}
}
