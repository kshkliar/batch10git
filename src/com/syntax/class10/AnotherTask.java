package com.syntax.class10;

public class AnotherTask {

	public static void main(String[] args) {

		String[] countries = { "Afghanistan", "Tajikistan", "USA", "Japan" };
		String capital = "";
		
		for (int i = 0; i < countries.length; i++) {

			switch(countries[i]) {
			
			case "Afghanistan":
				capital="Kabul";
				break;
			case "Tajikistan":
				capital="Dushanbe";
				break;
			case "USA":
				capital="DC";
				break;
			case "Japan":
				capital="Tokyo";
				break;
			}
			System.out.println("The country of " + countries[i] + " is " + capital);
		}
	
		System.out.println(" -------   ANOTHER WAY -------");

		capital = "";

		for (String country : countries) {

			if (country.equals("Afghanistan")) {
				capital = "Kabul";
			} else if (country.equals("Tajikistan")) {
				capital = "Dushanbe";
			} else if (country.equals("USA")) {
				capital = "Washington DC";
			} else if (country.equals("Japan")) {
				capital = "Tokyo";
			}
			System.out.println("The country of " + country + " is " + capital);
		}
	}
}
