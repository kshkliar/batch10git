package com.syntax.class10;

public class Recap1 {

	public static void main(String[] args) {

		String []a = new String[2];
		System.out.println(a.length);

		for (String aa:a) {
			System.out.println(aa);
		}
		System.out.println("--------------");

		String[]array=new String[3];
		array[0] = "Hello";
		array[1]="Hi";
		System.out.println(array[1]);
		System.out.println(array[2]);

		array[2] = "How are you?";
		System.out.println(array[2]);//How are you?

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "; ");

		}
		System.out.println("-------------------------------------");
		for (String arrtrht : array) {
			System.out.print(arrtrht+ "; ");
		}

	}
}
