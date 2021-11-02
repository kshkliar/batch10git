package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization1 {
	
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
		
	int age;
	String name;
	String result = null;
	Scanner scan;
	
	scan= new Scanner(System.in);
		System.out.println("Please enter your name");
		name=scan.nextLine();

		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		if (age>0&&age<3){
			result="baby";
			
		}else if(age>3&&age<6){
			result="toddler";
		}else if(age>6&&age<12){
			result="toddler";
		}else if(age>12&&age<20){
			result="teenager";
		}else if (age>20&&age<65){
			result="adult";
		}else if(age>65){
			result="senior";
		}

		System.out.println("You are "+ result);
		
	}
}
