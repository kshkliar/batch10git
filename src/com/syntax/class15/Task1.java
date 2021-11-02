package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements: Username and Password cannot be empty, if so
		 * message=”Username and Password cannot be empty”. Password should be minimum 8
		 * characters, if less message=”Password is too short”. Password cannot contain
		 * username if so, message=”Password cannot contain username”. Password should
		 * match confirmed password, if not message=“Passwords do not match”. Only after
		 * all requirements met message “Your username and password has been created”
		 */

		String username = "sharif123";
		String password = "sharif123wed";
		String confirmPassword = "skdfgbk";

		if (!(username.isEmpty() || password.isEmpty())) {
			
			if (password.length() >= 8) {
				if (!password.contains(username)) {

					if(password.equals(confirmPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
					
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Username and Password cannot be empty");
		}

	}

}
