package com.syntax.class10;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using 2D array create a grocery list. Inside you should have an array of
		 * , fruits, dairy and sweets. Retrieve all values from that array using
		 * 2 different loops
		 */
		/*
		 * Bakery and Bread. Meat and Seafood. Pasta and Rice. Oils, Sauces, Salad
		 * Dressings, and Condiments. Cereals and Breakfast Foods. Soups and Canned
		 * Goods. Frozen Foods. Dairy, Cheese, and Eggs.
		 */
		
		
		System.out.println("-----For Loop------");
		String [][]grocery={
		{"lemon", "banana","apple", "orange"},
		{"milk", "butter", "cheese", "yougurt"},
		{"cream", "candy", "icecream", "cokies"},
		
	};
	
		for (int g=0; g<grocery.length; g++) {
			for (int f=0; f<grocery[g].length;f++) {
				System.out.println(grocery[g][f]+ " ");
			}System.out.println();
			
			
			System.out.println("------Advenced for loop-----");
			
			for (String [] list:grocery) {
				for (String newList:list) {
					System.out.println(newList+ " ");
				}System.out.println();
				}
			}
			}
		}
	
	


