package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScannera {
	
	public static void main(String[] args) {
		
		/*
		 * Using scanner create an array of integer elements;
		 */

		int[] array = {13};
		//array[1]=12; out of bond
		System.out.println(array.length);
		Scanner scan = new Scanner(System.in);
		System.out.println("How many element do you want to store inside an array");
		int size= scan.nextInt();;

		int []numbers=new int [size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter value to be stored to index " + i);
			numbers[i]=scan.nextInt();
		}

		System.out.println(" Display all enements from an array ");

		for (int num : numbers) {
			System.out.println(num+ " ");
		}


	}
}
