package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap1 {

	public static void main(String[] args) {

		/*
		 * write a program to ask if user got a visa If user got a visa let's ask how
		 * long is visa for
		 * if visa is  more than 1 year --> cool if less --> you
		 * will have to go back in 1 year and to apply again
		 */

		Scanner scan;
		String visa;
		int duration;

		scan = new Scanner(System.in);
		System.out.println("Hi, have you got visa?");
		visa = scan.nextLine();

		if (visa.equals("Yes")) {
			System.out.println("How long is your visa for?");

			duration = scan.nextInt();
			if (duration > 1) {
				System.out.println("Cool, you have valid visa!");
			} else {
				System.out.println("You will have to come back in a year and apply again");


			}
		}
		if (!visa.equals("Yes")) {
			System.out.println("Sorry, we can not help you with no visa");
		}
	}
}
