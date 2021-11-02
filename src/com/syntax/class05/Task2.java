package com.syntax.class05;

import java.util.Scanner;
/*
Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”*/
public class Task2 {

	public static void main(String[] args) {

		Scanner variable = new Scanner(System.in);
		System.out.println("Please enter 1-7 for the days");
		int day = variable.nextInt();

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(" -------------------------------------------  ");

		Scanner input = new Scanner(System.in);

		System.out.println("Please input day of week (1-7)");
		day = input.nextInt();

		if (day >= 1 && day < 6) {
			System.out.println("It’s a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("It’s a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println(" -------------------------------------------  ");

		Scanner in = new Scanner(System.in);

		System.out.println("Please input day of week (1-7)");
		day = in.nextInt();

		if (day >= 1 && day < 6) {
			System.out.println("It’s a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It’s a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}
}
