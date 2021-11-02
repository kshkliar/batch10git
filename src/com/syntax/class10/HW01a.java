package com.syntax.class10;

public class HW01a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create 2D array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */

		String[][] cars = { 
				{ "Ford", "Jeep", "Dodge", "Chrysler" },
				{ "Mersedes", "Opel", "BMW", "VW" },
				{ "Daewoo", "Hyundai", "Kia", "Ssangyong" },
				{ "Ferrari", "Fiat", "AlfaRomeo", "Lamborghini" }, 
				};


		System.out.println("-----------For loop-----------");
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j]+", ");
			}
			System.out.println();
		}


		System.out.println("-------Advanced for loop-------");

		for (String[] c : cars) {
			for (String d : c) {
				System.out.print(d+ " ");
			}
			System.out.println();
		}
	}
}
