package com.syntax.class04;
import java.util.Scanner;

public class HMTask22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc= new Scanner(System.in);  // создали класс
		System.out.println("Please enter your age");
		int age=sc.nextInt();  //создали к нему метод
		if (age>18){
			System.out.println("Driving license will be issued for you soon");
		}else{
			System.out.println("You are too young");
		}

	}

}
