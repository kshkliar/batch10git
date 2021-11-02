package com.syntax.class12;

public class Cata {

String name;
String color;
int age;

	void eat() {
		System.out.println(name + " is eating");
	}

	void sleep() {
		System.out.println(name+ " is sleeping");
	}



	public static void main(String[] args) {
		Cata cat1 = new Cata();
		cat1.name="Tom";
		cat1.color="Black";
		cat1.age=5;
		cat1.eat();
		cat1.sleep();


		Cata cat2= new Cata();
		cat2.name="Jerry";
		cat2.color="grey";
		cat2.age=12;
		cat2.sleep();
	}

	}


