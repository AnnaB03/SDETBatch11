package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		//The String class is mutable and StringBuilder class is unmutable
		//Mutable - all changes will reflect the original method
		//StringBuilder use when we plan to change the content again and again
		//when string keep changing we use strinBuilder
		
		String str = "Me: Look it's not you it's me";
		System.out.println(str.replace(" ", ""));  //will delete all the spaces even between words - creates a new str
		str=str.replace("\\s", ""); ////will delete all the spaces even between words - creates a new str
		System.out.println(str.replaceAll(" ", "")); ////will delete all the spaces even between words - creates a new str
		System.out.println(str);
		StringBuilder str2 = new StringBuilder("Me: Look it's not you it's me, I just have some thing i need to work out"); 
		System.out.println(str2.reverse()); //will reverse but won't delete the spaces between
		System.out.println(str2);
		


	}

}
