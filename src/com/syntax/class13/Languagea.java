package com.syntax.class13;

public class Languagea {
//Create a method that will say hello in different language based on the country 
	//that will passed when the method is executed


	void checkLanguagePadlo(String language) {//
		String greeting;
		switch(language) {
			case"English":
				greeting="Hello";
				break;
			case "Ukrainian":
				greeting="Zdorovenki Buli or Dobriy den'";
				break;
			case "Russian":
				greeting="Privet";
				break;
			case "Spanish":
				greeting="Hola";
				break;
			default:
				greeting="Unknown language";
		}
		System.out.println(greeting);
	}
	}
	

