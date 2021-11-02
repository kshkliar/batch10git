package com.syntax.class13;

public class HW3Polidrome {

	//Create a method that will print whether given String 
	// is polidrome or not.
	
	void polidromeMethod (String word) {
		String reserved= "";
		for (int i=word.length()-1;i>0;i--) {
			reserved =reserved +word.charAt(i);
		}
		if (reserved.equals(word)) {
			System.out.println("Word" + word + "is a polindrome");
		}else {
			System.out.println("Word" + word+ " is not polindrome");
		}
	}

}
