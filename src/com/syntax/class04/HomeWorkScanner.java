
package com.syntax.class04;
import java.util.Scanner;
public class HomeWorkScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner scan =new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name=scan.nextLine();

		 System.out.println("Enter your mobile number");
		 String mobile=scan.nextLine();
		 System.out.println("Enter your age");
		 int age=scan.nextInt();
		 char ch1=',';
		 System.out.println("Your name is"+" " +name+ch1+" "+"your age is "+age+" and your mobile number is"+" "+ mobile);
		     //		     int age=scan.nextLine();
		     //int age = scan.nextInt();
	}

}
