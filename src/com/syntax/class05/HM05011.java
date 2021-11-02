package com.syntax.class05;

import java.util.Scanner;

public class HM05011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner input = new Scanner(System.in);

int quiz;
int midTerms;
int finalScore;
int aver;
		System.out.println("Please enter your score: quize, mid term, and final scores");
		quiz=input.nextInt();
		midTerms=input.nextInt();
		finalScore=input.nextInt();
		aver=(quiz+midTerms+finalScore)/3;
		System.out.println("Your average score is " + aver);
		if (aver>=90){
			System.out.println("Grade=A");
		}else if(aver>=70&&aver<90){
			System.out.println("Grade =B");
		}else if(aver>=50&&aver<70){
			System.out.println("Grade=C");
		}else{
			System.out.println("Grade=F");
		}
		
	}

}
