package com.syntax.class04;

public class Task3 {

	/*
	 * Create a Java program and call it a Donor. In order to be eligible to donate
	 * your blood you have to be 18 years old. Also once you identify age
	 * eligibility then we have to see if person matches weight requirements. If
	 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
	 * cannot accept such a patient.
	 * 
	 */

	public static void main(String[] args) {

		int age = 18;
		double weight = 200;

		if (age >= 18) {

			System.out.println("Let;s check if you meet all other requirements");
			
			if (weight > 100) {
				System.out.println("you can donate");
			} else {
				System.out.println("you can not donate");
			}

		} else {
			System.out.println("you are not eligible for donation");
		}
		
	}
}
