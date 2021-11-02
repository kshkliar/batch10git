package com.syntax.class04;
import java.util.Scanner;
public class HMTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please, write your age");
		int age=sc.nextInt();
		if (age>=18) System.out.println("Driving license will be issued to you soon");
		else System.out.println("Please, get learner permit");
	}

}
