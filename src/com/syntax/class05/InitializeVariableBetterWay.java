package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariableBetterWay {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter 3 distinct numbers then find the largest
		 */

		Scanner scan;
		int num1, num2, num3, largest;

		scan = new Scanner(System.in);
		System.out.println("Plese enter 3 distinct numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1>num2 && num1>num3) {
			largest=num1;
		
		} else if (num2>num1 && num2>num3) {
			largest=num2;

		} else {
			largest=num3;
		}
		
		System.out.println("The largest number "+largest);
		
		//lets identify if largest is even or odd
		
		if (largest%2!=0) {
			System.out.println(largest+" number is odd");
		}else {
			System.out.println(largest+" number is even");
		}
		
	}
}
