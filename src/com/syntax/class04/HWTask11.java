package com.syntax.class04;
import java.util.Scanner;

public class HWTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("What is the amount of loan do you need?");
		Scanner scan=new Scanner(System.in);
		double ammount=scan.nextDouble();
		if (ammount<20000)
			System.out.println("Bank approves loan for you");
		else System.out.println("Bank not approves loan for you");
	}

}
