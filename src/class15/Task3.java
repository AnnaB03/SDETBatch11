package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		// You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(str.split("[?.!]").length); //separating the sentences and counting them after -- .lengh w/o parenthesis because we don't count all the characters

	}

}
