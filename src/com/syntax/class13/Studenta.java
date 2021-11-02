package com.syntax.class13;

public class Studenta {

	
	String name;
	String id;
	char gender;
	double tutition;
	String school;
	char currency;
	void study(){System.out.println(name+ " studies in " + school);}


	void payForTuition(){
		System.out.println(name+" pay "+tutition+" "+currency);
	}

}
