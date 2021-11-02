package com.syntax.class06;

public class LogicalOperatorsRecap1 {
	
	public static void main(String[] args) {

		System.out.println("------Or Example---------");
		String position = "Automation Tester";
		if (position.equals("Automation tester") || position.equals("Manual tester")) {
			System.out.println("I am happy");
		}
		System.out.println("-----And Example-------");

		int salary = 100000;



		if (position.equals("Automation Tester")&&salary>=100000){
			System.out.println("I am extremely happy !!!!");
		}
		System.out.println("------NOT Example------");

		boolean study=false;
		if(!study){
			System.out.println("You are not going to get a job");
		}
	}
}
