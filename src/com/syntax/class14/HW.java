package com.syntax.class14;

public class HW {

	
	
	void Info(String userName, String password, String confirmation) {
		
		if(userName.isEmpty()||password.isEmpty()) {
			System.out.println("Username and password can not be empty");}
		else if(password.length()<8) {
			System.out.println("Password is too short");}
		
		else if (password.contains(userName)) {
			System.out.println("Password can not contain username");}
			
			else if(!(confirmation.equals(password))) {
				System.out.println("Password does not match");}
				else {
					System.out.println("Your username and password has created");}
				
				}
}
	

