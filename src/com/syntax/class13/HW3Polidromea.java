package com.syntax.class13;

public class HW3Polidromea {

	//Create a method that will print whether given String 
	// is polidrome or not.

	void poliMethod(String anyword) {
		String reserved = "";
		for (int i = anyword.length() - 1; i > 0; i--) {
			reserved=reserved+anyword.charAt(i);
		}
		if (reserved.equals(anyword)) {
			System.out.println("Word "+anyword+ " is a polindrome");
		}else{
			System.out.println("Word"+anyword+ " is not polindrome");
	}
	}

}
