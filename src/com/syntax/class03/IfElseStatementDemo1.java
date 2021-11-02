package com.syntax.class03;

public class IfElseStatementDemo1 {
	
	/*
	 * shortcut for main:
	 * type main +ctrl+space+enter
	 */
	
	public static void main(String[] args) {
		
		/*
		 * I have money and I know price
		 * if I have more money --> I will buy cookies
		 * otherwise I will cry
		 */

		System.out.println("----Biginning of my program-----");

		double myMoney=1;
		double priceOfCookies=1.99;
		if(myMoney>priceOfCookies){
			System.out.println("I will buy cookies");
		}else{
			System.out.println("I will cry");
		}
	}
}
