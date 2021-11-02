package com.syntax.class10;

public class TwoDArrayExamples {

	public static void main(String[] args) {

		String[][] food = { 
				{ "borsh", "vareniki", "draniki" }, 
				{ "kebabs", "palaw", "mantu" },
				{ "tacos", "burito", "queso", "salsa" }, 
				{ "pasta", "pizza", "bread", "risotto" } };

		System.out.println(food.length);// 4 --> total # of rows or arrays
		int sizeOf1Array = food[0].length;
		System.out.println(sizeOf1Array);

		int sizeOfArray = food[3].length;
		System.out.println(sizeOfArray);

		System.out.println(food[2][1]);
		food[3][2] = "cheese";
		System.out.println(food[3][2]);
		// how to get all values from 2D array

		for (int i = 0; i < food.length; i++) { // iterates over rows /arrays

			for (int j = 0; j < food[i].length; j++) {// iterate over columns/ each element from an array

				System.out.println(food[i][j]);
			}
		}

	}
}
