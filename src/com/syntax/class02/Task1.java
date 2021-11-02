package com.syntax.class02;

public class Task1 {

	public static void main(String[] args) {

		String name ="Sedat";
		String lastName="Atakan";
		String city="Dayton";
		String city2="Chicago";
		String state= "Ohio";
		char grade= 'A';
		String number="123-235-3789";

		String text= "Hello";

		System.out.println("My name is "+ name+ " my last name is "+ lastName+ " I am an "+ grade+ "" +
				" student"+ "I moved to "+ city+ " "+ state+ ". My phone number is " + number);

		grade= 'a';
		state= "Illinoise";
		number= "123-344-1223";
		city2="Chicago";


		String student ="My name is"+ " " + name+ " "+ "I moved to a new city " +city2+ " and new state "
				+state+ ". my phone number is"+ number;
		System.out.println(student);
	}


}
