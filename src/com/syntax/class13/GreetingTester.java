package com.syntax.class13;

public class GreetingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println(" Line in the main method");
		Greetings greeting=new Greetings();
		//greeting.sayHello();
		//System.out.println("Line after the method call");
		greeting.printNumber(10);
		greeting.printNumber(100);
		greeting.printNumber(125);
		greeting.sayHelloManyTimes(5);
	}

}
