package replit;

import java.util.Scanner;

public class Task044a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For you to do:
		 * 
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 */
		String carOrigin;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		carOrigin=scan.next();
		switch (carOrigin) {
			case"BMW":
				System.out.println("german car");
				break;
			case "Toyota":
				System.out.println("japanese car");
				break;
			case "Maaerati":
				System.out.println("italian car");
				break;
			default:
				System.out.println("Unknown");

		}
	}

}
