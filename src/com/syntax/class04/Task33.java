package com.syntax.class04;

public class Task33 {

	/*
	 * Create a Java program and call it a Donor. In order to be eligible to donate
	 * your blood you have to be 18 years old. Also once you identify age
	 * eligibility then we have to see if person matches weight requirements. If
	 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
	 * cannot accept such a patient.
	 * 
	 */

	public static void main(String[] args) {

		int age=17;
		double weight=150;

		if(age>18){
			System.out.println("Your age is ok, Lets check your weight");
			if (weight>110){
				System.out.println("Your can be a donor");
			}else{
				System.out.println("Your can not donate");
			}
		}else{
			System.out.println("Your are not eligible for donation because of age");
		}

	}
}
