package com.syntax.class14;

public class HW2 {
//Dads first name? Daniel/Boy or Girl?-Girl
	//Suggested baby name: MAEL
	String info (String momName, String dadName, String gender) {
		String babyName;
		if (gender.equalsIgnoreCase("boy")) {
		babyName=dadName.substring(dadName.length()/2).concat
				(momName.substring(momName.length()/2,momName.length()));
		}
		else if (gender.equalsIgnoreCase("girl")) {
			babyName=momName.substring(momName.length()/2).concat
					(dadName.substring(dadName.length()/2,dadName.length()));
		}
		else {
			babyName="invalid";}
	
	
		
		
		
		return babyName;
}
}

