package com.syntax.class07;

import java.util.Scanner;

public class HWwitchIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x, y, result = 0;
		char operator;
		String operation = null;
		System.out.println("Enter first number");
		x = scan.nextDouble();
		System.out.println("Enter ariphmetic operator + or - or * or /");
		operator = scan.next().charAt(0);
		System.out.println("Enter second number");
		y = scan.nextDouble();

		if (operator == '+') {
			result = x + y;
			operation = "addition";
		} else if (operator == '-') {
			result = x - y;
			operation = "substruction";
		} else if (operator == '*') {
			result = x * y;
			operation = "multiplication";
		} else if (operator == '/') {
			result = x / y;
			operation = "division";
		} else {
			System.out.println("Wrong ariphmetic operator");
		}

		System.out.println("The result of " + operation + " " + x + " and " + y + " is " + result);
	}
}
