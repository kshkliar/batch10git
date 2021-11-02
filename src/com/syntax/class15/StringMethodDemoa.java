package com.syntax.class15;

public class StringMethodDemoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am a good tester. I am a good person";
		System.out.println(str.replace("a", "A"));// меняет целевой едлемент на replacement
		System.out.println(str.replace("good", "Naughty"));
		
		String str2="skdgksgbASAHDS645678358!@#$%$&%*^";
		System.out.println(str2.replaceAll("[0-5]", "+")); // will replace all the numbers from 0-9 in the string
		System.out.println(str2.replaceAll("[A-Z]", ""));  // will remove all the uppercase letters from the original string 
		System.out.println(str2.replaceAll("[a-z]", ""));	// will remove all the lower case letters 
		System.out.println("================================");
		System.out.println(str2.replaceAll("[a-z5-9]", ""));  // will remove all the lower case letters and numbers
		System.out.println(str2.replaceAll("[a-z5-9A-Z]", "")); // will remove all the upper case lower case and numbers in the range
		System.out.println(str2.replaceAll("[a-z5-9A-Z]", "")); 
		System.out.println(str2.replaceAll("[^a-z0-9A-Z]", "")); 
		System.out.println(str2.replace("^", "")); 
		 str2="";
		
	}

}
