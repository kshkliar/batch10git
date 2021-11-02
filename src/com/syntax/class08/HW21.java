package com.syntax.class08;

import java.util.Scanner;

public class HW21 {

	public static void main(String[] args) {

		/*
		 * Ask user to pay for a candy keep asking user to pay for candy until entered
		 * price is not equal to 3
		 *
		 * if entered value is more than 3 --> please give less money otherwise -->
		 * please give more money
		 *
		 * after user got a write amount print "Please enjoy your candy"
		 */

		Scanner in = new Scanner(System.in);

		int money;
		System.out.println("Please pay for your candy");
		do {

			money = in.nextInt();
			if (money > 3) {
				System.out.println("Please give less money");
			} else if (money < 3) {
				System.out.println("Please give more moey");
			}
		} while (money != 3);
		System.out.println("Please enjoy your candy");
	}
}