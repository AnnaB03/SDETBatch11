package com.syntax.class15;

public class SyntaxStudent {
	
	static String school = "Syntax"; //static is the special area inside the computer memory that holds values that are shared across all objects
	static int durationOfCourse =6;  //instance shared value across methods
	String name; 
	String id;
	
	void calculateFee() {
		int currentMonth =3;
		double tax = .10;
		System.out.println(name + " has to pay "+ currentMonth*1000 + 1000*tax);
		
	}
	

}
