package com.syntax.class05;

import java.util.Scanner;

public class Recap1 {

	public static void main(String[] args) {
	String str;
	str="some value";
	Scanner input;
	input= new Scanner(System.in);
		System.out.println("Please enter something");
	int num =input.nextInt();
		System.out.println(num);
		System.out.println("Please enter something more");
		char singleChar=input.next().charAt(0);
		System.out.println(singleChar);

		str=input.next();
		System.out.println(str);

		input.nextLine();
		str=input.nextLine();
		System.out.println(str);
		
		//break till 11:30
	}
}
