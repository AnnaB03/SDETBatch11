package com.syntax.class15;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "casper";
		dog.color = "black";
		dog.sleep();
		dog.noOfLegs=4; //setting the value of the Dog object to the static variable
		
		//
		
		Dog dog2 = new Dog();
		dog.name = "caspersky";
		dog.color = "white";
		dog.sleep();
		System.out.println(dog2.noOfLegs);
	}

}
