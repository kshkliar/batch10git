package com.syntax.class10;

public class HW01 {

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
			for (int n = 0; n < cars[i].length; n++) {
				System.out.println(cars[i][n] + " ");
			}
			System.out.println();
		}
		System.out.println("-------Advanced for loop-------");
		for (String[] c : cars) {
			for (String d : c) {
				System.out.println(d + " ");
			}
			System.out.println();
		}
	}
}
