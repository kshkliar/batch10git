package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {

		/*
		 * we have test --> yes or no
		 * 
		 * if you done test then I want to check the score
		 * 
		 * score is more than 90 --> A student score is more than 80 --> B student score
		 * is more than 70 --> C student otherwise : you should study more for test
		 */

		boolean isCompleted = true;
		int score = 99;

		if (isCompleted) {

			System.out.println("Let's check your grade");

			if (score > 90) {
				System.out.println("A student");
			} else if (score > 80) {
				System.out.println("B student");
			} else if (score > 70) {
				System.out.println("C student");
			} else {
				System.out.println("Please study more before taking the test");
			}

		} else {
			System.out.println("You should have taken the test !");
		}
	}
}
