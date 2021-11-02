package com.syntax.class10;

import java.util.Scanner;

public class Task2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Create an array of countries.
		/*While retrieving all values from an array print
		 * capital for each country.(use 2 different loops
		 */
		final int size = 2;
		Scanner in = new Scanner(System.in);
		String countries[] = new String[size];
		String capitals[] = new String[size];
		System.out.println("Enter " + size + " countries and their capitals");

		for (int i = 0; i < size; i++) {
			System.out.println("Enter country name: ");
			countries[i] = in.nextLine();
			System.out.println("Enter its capital: ");
			capitals[i] = in.nextLine();
		}

		System.out.println("Country Nasmes\t\tCapital");
		for (int i = 0; i < size; i++) {
			char ch = Character.toUpperCase(countries[i].charAt(0));
			if (ch == 'A' ||
					ch == 'E' ||
					ch == 'I' ||
					ch == 'O' ||
					ch == 'U') {
				System.out.println(countries[i] + "\t\t" + capitals[i]);
			}



	                /*Which of these is an incorrect array declaration?
a) int arr[] = new int[5];
b) int [] arr = new int[5];
c) int arr[] = new int[5];
d) int arr[] = int [5] new;*/


		}
	}
}