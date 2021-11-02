package com.syntax.class12;

public class CarTestera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cara car1 = new Cara();
		car1.make = "Toyota";
		car1.model="Rav4";
		car1.color="Black";
		car1.year=2020;
		System.out.println("I have "+car1.make);
		car1.moveBackward();// вызвали метод 1

		Cara car2 = new Cara();
		car2.make = "Ziguli";
		car2.model = "Copeika";
		car2.color = "White";
		car2.year=2019;
		car2.moveForward();// вызвали метод 2
	}

}
