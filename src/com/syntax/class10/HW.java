package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print those in reverse order
		 */
		double[] numbers = { 10.99, 15.1, 1.99, 23.99 };

		for (int a = numbers.length - 1; a >= 0; a--) {

			System.out.println(numbers[a]);
		}
		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int arr[] = { 2, 88, 74, 1, 96};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Total = "+sum);
		
		System.out.println(" -------   SUM USING ENHANCED FOR LOOP  -----------");
		
		sum=0;
		
		for(int num:arr) {
			
			sum += num;
		}
			
	    System.out.println("Total = "+sum);

	}
}
