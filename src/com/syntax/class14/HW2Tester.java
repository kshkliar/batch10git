package com.syntax.class14;

import java.util.Scanner;

public class HW2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HW2 name =new HW2();
		Scanner scan=new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName=scan.next();
		
		System.out.println("Dad's first name?");
		String dadName=scan.next();
		
		System.out.println("Boy or Girl?");
		String gender=scan.next();
		
		System.out.println("Suggested baby name is:"+name.info(momName, dadName, gender));
		
	}

}
