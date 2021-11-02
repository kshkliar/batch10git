package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//let's capture first and last name
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		
		System.out.println("Please enter your last name");
		String lastName=scan.nextLine();
		
		System.out.println("Please tell me country where are you from");
		String country=scan.nextLine();
		
		System.out.println("Nice to meet you "+name+" "+lastName+" from "+country);
		
		/*
		 *  next() - is used to capture a String value before space
		 *  nextLine() - is used to capture String value (full line including
		 * spaces)
		 */
		
		
		
	}
}
