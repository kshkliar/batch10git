package com.syntax.class10;

public class HW02a {

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
		
		

		String [][]grocery={
		{"lemon", "banana","apple", "orange"},
		{"milk", "butter", "cheese", "yougurt"},
		{"cream", "candy", "icecream", "cokies"},
		
	};

		System.out.println("-----For Loop------");
		for (int i = 0; i < grocery.length; i++) {
			for (int j = 0; j < grocery[i].length; j++) {
				System.out.print(grocery[i][j] + "\t");
			}
			System.out.println();  //после каждого ряда переход на новую строку		}
		}
		System.out.println("");
		System.out.println("------Advenced for loop-----\n");

		for (String[] list : grocery) {
			for (String newList : list) {
				System.out.print(newList+ " ");
			}
			System.out.println();
		}

			}
		}
	
	


