package com.syntax.class16;

public class Task2Reverse {
	//Create a method that will take a String as a parameter 
	//and returns reversed String. Method should be available 
	//to all classes within your project and accessible by class name.
	
	public static String reverseStr (String str) {
		
	/*StringBuilder strbuilder = new StringBuilder(str);
	strbuilder.reverse();
	String newStr = strbuilder.toString();
	return newStr; */
	
		
		return new StringBuilder(str).reverse().toString();
		
	}

}
