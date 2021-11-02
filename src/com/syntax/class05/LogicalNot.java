package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b = !true;

		boolean a = !false;

		System.out.println(b); // false
		System.out.println(a); // true

		boolean hungry = false;

		if (!hungry) {
			System.out.println("I am not hungry");
		}
		
		System.out.println(" ---------------------------  ");
		
		boolean hot=false;
		
		if(!hot) {
			System.out.println("I will go for a walk");
		}
		
		System.out.println("End of the class code");
		
		String name="Hamza";
		
		if(!name.equals("Stephanie")) {
			System.out.println("Then I am NOT looking for you");
		}

	}
}
