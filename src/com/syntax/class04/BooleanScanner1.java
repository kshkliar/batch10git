package com.syntax.class04;
import java.util.Scanner;

public class BooleanScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Are you above 18?-");//ask about age
		Scanner sc=new Scanner(System.in); //creating scanner
		boolean bn= sc.nextBoolean();// capture boolean value;
		if(bn==true){
			System.out.println("You are over 18");
	}else if(bn==false){
			System.out.println("You are under 18");
		}

}
}