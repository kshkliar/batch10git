package com.syntax.class05;

import java.util.Scanner;

/*
Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”*/
public class Task21 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter day 1 to 7");
		int day=scan.nextInt();
		if(day>=1&&day<=5){
			System.out.println("It is weekday");
		}else if(day>=6&&day<=7){
			System.out.println("It is weekend");
		}else{
			System.out.println("Invalid number");
		}

		System.out.println("----Second method-----");

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter numbers 1-7 - days of the weeek" );
		int weekDay=input.nextInt();
		if(weekDay==1||weekDay==2||weekDay==3||weekDay==4||weekDay==5){
			System.out.println("It is weekday");
		}else if(weekDay==6||weekDay==7){
			System.out.println("It is weekend");
		}else{
			System.out.println("Invalid number");
		}
		System.out.println("----Method 3------");

		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter number 1-7");
		int num17=scanner.nextInt();
		if(num17>=1&&num17<=6){
			System.out.println("It is weekday");
		}else if(num17==6||num17==7){
			System.out.println("It is weekend");
		}else{
			System.out.println("It is invalid number");
		}
	}
}
