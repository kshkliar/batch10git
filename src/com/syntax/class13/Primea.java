package com.syntax.class13;

public class Primea {

	//Write a method to return whether given number is prime or not

	void isItPrime (int a) {
		int counter =0;
		for (int i=2; i<a;i++) {
			if (a%i==0) {
				counter++;
				
			}
		}
		if (counter==0) {
			System.out.println(a + " is a Prime number");
		}else {
			System.out.println(a + " is Not a Prime number");
		}
		
		
		
	}

}
