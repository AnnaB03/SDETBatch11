package com.syntax.class16;

public class Dog {
	
	String name;
	static int noOfLegs = 4;
	String color;
	
	void displayColor () {
		System.out.println(color);
	}
	
	void displayName () {
		System.out.println(name);
	} 
	
	void printInfo () {
		displayName();
		displayColor();
		displayLegs();
	}
	
	static void displayLegs () {
		//displayName();
		//System.out.println(name); not allowed to access instance fields in the static method
		System.out.println(noOfLegs);
	}

}
