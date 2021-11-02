package com.syntax.class10;

public class TwoDArrayExamples_a {

    public static void main(String[] args) {

        String[][] food = {
                {"borsh", "vareniki", "draniki"},
                {"kebabs", "palaw", "mantu"},
                {"tacos", "burito", "queso", "salsa"},
                {"pasta", "pizza", "bread", "risotto"}};

        System.out.println(food.length);// 4 --> total # of rows or arrays

        int sizeof1Array = food[0].length;
		System.out.println(sizeof1Array);

		int sizwofArray = food[3].length;
		System.out.println(sizwofArray);

		System.out.println(food[2][1]);
		food[3][2]="chesee";
		System.out.println(food[3][2]);

		// how to get all values from 2D array
		for (int i = 0; i < food.length; i++) { // iterates over rows /arrays
			for (int j = 0; j < food[i].length; j++) { // iterate over columns/ each element from an array

			}
		}





    }
}
