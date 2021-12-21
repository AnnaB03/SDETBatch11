package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		
		String str = "aba";
		StringBuilder strB = new StringBuilder (str);
		strB.reverse();
		if (str.equals(strB.toString())) { //strB is equal to String 
			System.out.println(str + " is palindrome");
		} else 
			System.out.println(str + " is not palindrome");

	}

}
