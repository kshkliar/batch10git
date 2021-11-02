package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {
	
	public static void main(String[] args) {
		
		/*
		 * ask user to enter name and age
		 * based on age define who is a user
		 * if age is from 0-3 --> baby
		 * if age is from 3-6 --> toddler
		 * if age is from 6-12 --> kid
		 * if age is from 12-20 --> teenager
		 * if age is from 20-65 --> adult
		 * if 65+ --> senior
		 * 
		 */
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=in.nextLine();
		
		System.out.println("Please enter your age");
		int age=in.nextInt();
		
		String whoAreYou=null;
		
		if(age>=0 && age<3) {
			whoAreYou="baby";
		}else if (age>=3 && age<6 ) {
			whoAreYou="toddler";
		}else if(age>=6 && age<13) {
			whoAreYou="kid";
		}else if(age>=13 && age<20) {
			whoAreYou="teenager";
		}else if (age>=20 && age<65) {
			whoAreYou="adult";
		}else if (age>=65){
			whoAreYou="senior";
		}
		
		if (whoAreYou!=null) {
			System.out.println(name+" you are "+whoAreYou);
		}

	}
}
