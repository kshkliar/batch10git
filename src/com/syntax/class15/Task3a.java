package com.syntax.class15;

public class Task3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a String and if the String is not empty perform the following:
		//if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String.


		String name="hello";
		if (!name.isEmpty()) {
			if (name.length() > 3 && name.length() % 2 != 0) {
				System.out.println(name.charAt(name.length()/2));
			}
		}


	}

}
