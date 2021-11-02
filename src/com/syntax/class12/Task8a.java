package com.syntax.class12;

public class Task8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10, 9, 12, 201, 0, 225};

		int largest = array[0];
		int secondlargest = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest){
				secondlargest = largest;
			largest = array[i];
		}else if (array[i] > secondlargest){
				secondlargest=array[i];
			}
	}
		System.out.println(largest);
		System.out.println(secondlargest);
}
}
