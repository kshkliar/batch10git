package com.syntax.class12;

public class Task5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Break till 12:10
		// new change
		//5) Write a java program to check whether a given number is prime or not?
		//a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11)
		// negative numbers are nor prime numbers


		int number=15;
		boolean isPrime=true;
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime=false;
					break;
				}
			}
		}else{
			isPrime=false;
		}


		System.out.println(number+ " is prime "+isPrime);


	}

}
