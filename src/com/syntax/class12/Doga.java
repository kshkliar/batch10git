package com.syntax.class12;

public class Doga {
	
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;

	void bark() {
		System.out.println("Dog can bark");

	}

	void sleep() {
		System.out.println("Dog can sleep");
	}

	public static void main(String[] args) {


	Doga zosya=new Doga();
	zosya.name="Zosya";
	zosya.breed="Doberman";
	zosya.color="Broun";
		zosya.age = 20;
		zosya.height=15;
		zosya.gender='F';
		zosya.bark();
		zosya.sleep();




		Doga dog2= new Doga();
		dog2.name = "Ledy";
		dog2.breed = "Ovcharka";
		dog2.color = "Grey";
		dog2.age=100;
		dog2.height=12;
		dog2.gender = 'M';
		dog2.sleep();
		System.out.println(dog2.name+" can sleep");
		System.out.println(zosya.name+ " can bark");
	}

}
