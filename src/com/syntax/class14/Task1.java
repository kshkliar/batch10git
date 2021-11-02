package com.syntax.class14;

public class Task1 {

	
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void printGreater(int num1,int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
	}
	
	//Create a method that will take a number and prints
	//whether the number is even or odd.
	
	void printOdd(int number) {
		
		if(number%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		
	}
	
	
	
}
