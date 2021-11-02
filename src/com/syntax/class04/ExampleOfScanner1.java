package com.syntax.class04;

//shortcut to import: mac -> cmd+shift+o    windows --> ctrl+shift+o


import java.util.Scanner;

public class ExampleOfScanner1 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);//creating scanner
	// capture integer value
		System.out.println("Please enter your age");
		int age = scan.nextInt();

		//capture String values and we stored inside variable value
		System.out.println("Please enter your name");

		String name;//capturing String value
		name = scan.next();
		String n=name;
		System.out.println( "Hello "+n);

		System.out.println(n+ "is "+age+ " year old");
	}
}
