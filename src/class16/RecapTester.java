package com.syntax.class16;

public class RecapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recap recap= new Recap();//creating an object
		recap.number =10; //we call methods
		recap.setConstantNumber();
		recap.setNumber(40);
		recap.printNumber(); //we accessing a variable  
		
		Recap recap2 = new Recap();
		//recap.setNumber(50);
		recap2.printNumber(); //assigning the value
		

	}

}
