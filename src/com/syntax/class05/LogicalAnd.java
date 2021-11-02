package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("That is awesome");
		} else {
			System.out.println("Please try tp spend more time with Java");
		}

		/*
		 * declare a number if number is smaller larger 1 AND smaller than 10 --> SMALL
		 * if number is larger than 10 but smaller than 100 --> MEDIUM if number is
		 * larger than 100 but smaller than 1000 -> Large otherwise numbers is huge
		 */

		int num = 1;

		if (num > 0) {

			if (num >= 1 && num < 10) {
				System.out.println("Number is small");

			} else if (num >= 10 && num < 100) {

				System.out.println("Number is medium");

			} else if (num >= 100 && num < 1000) {
				System.out.println("Number is large");

			} else {
				System.out.println("Number is HUGE");
			}

		}else {
			System.out.println("Number is either 0 or negative");
		}

	}
}
