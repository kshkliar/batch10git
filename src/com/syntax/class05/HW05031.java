package com.syntax.class05;
import java.util.Scanner;

public class HW05031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		int num1, num2, num3;

		scan = new Scanner(System.in);
		System.out.println("Please enter three distinct numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1>num2&&num1>num3){
			System.out.println(num1+ " is biggest number");
		}else if(num2>num3&&num2>num1){
			System.out.println(num2+ " is biggest number");
		}else if (num3>num1&&num3>num2){
			System.out.println(num3+ " is biggest number");
		}else{
			System.out.println("Please enter distinct numbers");
		}

	}
}