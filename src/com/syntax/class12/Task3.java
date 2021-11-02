package com.syntax.grouptasks;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3) Create a 2D array of integers. Develop a program which will calculate 
		//the sum of  even and odd numbers for that array.

		int evenSum=0;
		int oddSum=0;
		int[][] array = { { 1, 2, 3, 4, 5 },

				{ 10, 20, 30, 40, 50 } };

		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				if( array[row][col]%2==0) {
					evenSum=evenSum+array[row][col];
				}else {
					oddSum=oddSum+array[row][col];
				}
				
			}

		}
		
		System.out.println("Even number sum "+evenSum);
		System.out.println("Odd number sum "+oddSum);
		
	}

}
