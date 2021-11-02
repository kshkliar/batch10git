package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers1 {
	
	public static void main(String[] args) {
		
		
		//compare 2 numbers and see which one is the largest

		Scanner data=new Scanner(System.in);// creating scanner "data"
		System.out.println("Please enter first number");//asking for number
        int num1= data.nextInt(); //capturing number in variable num1

		System.out.println("Please enter second number");
		int num2=data.nextInt();

		if (num1>num2){
			System.out.println(num1+" is larger than " +num2);
		}else if(num1<num2){
			System.out.println(num1+ "is less than "+ num2);
		}else{
			System.out.println(num1+ " is equal to " +num2);
		}
	}
}
