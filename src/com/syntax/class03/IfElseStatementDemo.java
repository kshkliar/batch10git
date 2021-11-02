package com.syntax.class03;

public class IfElseStatementDemo {
	
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
		
		System.out.println("Beginning of my program");
		
		double money=10;
		double $cookie=1.99;
		
		
		if (money>$cookie) { //if true
			System.out.println("I am buying those cookies");
		}else { //if false
			System.out.println("I am going to cry");
		}
		
	}
}
