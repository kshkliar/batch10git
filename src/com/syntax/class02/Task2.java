package com.syntax.class02;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. "The _______ of 2 numbers ___ and ___ is equal
		 * to
		 * _____"
		 */

		double result, n1, n2;

		n1 = 8.01;
		n2 = 5.05;
		result = n1 + n2;
		String act = "add";
		System.out.println("The " + act + " of 2 numbers " + n1 + " and " + n2 + " is equal to " + result);

		result = n1 - n2;
		act = "subtract";
		System.out.println("The " + act + " of 2 numbers " + n1 + " and " + n2 + " is equal to " + result);

		result = n1 * n2;
		act = "multiply";
		System.out.println("The " + act + " of 2 numbers " + n1 + " and " + n2 + " is equal to " + result);
		result = n1 / n2;
		act = "divide";
		System.out.println("The " + act + " of 2 numbers " + n1 + " and " + n2 + " is equal to " + result);

		/*
		 * Write a program to find the square of the number 3.9. You program should say
		 * “The square of the ____ is ____ “
		 */

		double num1 = 3.9;
		double square = 3.9 * 3.9;

		System.out.println("The square of the" + num1 + " is " + square);

		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 * 
		 */
		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;

		System.out.println("The peruneter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);
		

	}
}
