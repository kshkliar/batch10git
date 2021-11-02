package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		System.out.println("TASK 1 --------------------------");

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}

			System.out.print(i + " ");

		}

		System.out.println("TASK 2 --------------------------");

		Scanner scan = new Scanner(System.in);
		String credit;

		do {
			System.out.println("Would you like to apply for credit card?");
			credit = scan.next();
			if (credit.equalsIgnoreCase("yes")) {
				break;
			}
		} while (true);
		
		System.out.println("Congratulation on selecting credit card! ");
		
		System.out.println("--------------------------");
		
		
		for (int i = 1; i > 5; i+=2) {

			System.out.print(i + " ");

		}
		
		System.out.println("End of the code ----");
	}
}
