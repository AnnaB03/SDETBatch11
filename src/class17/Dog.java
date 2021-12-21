package com.syntax.class17;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	
	//default constructor
	public Dog () {
		System.out.println("Default constructor");
	}
	
	//constructor starts
	//metered signature of the constructor :parameters and name
	public Dog (String dogName, String dogColor, String dogBreed, int dogAge, double dogWeight) {
		System.out.println("Dogs constructor is called");
		name = dogName;
		color = dogColor;
		breed = dogBreed;
		age = dogAge;
		weight = dogWeight;
		System.out.println(dogName);
		printAge();
		//prints constructor first
		//constructor ends
	}
	public void printName () {
		System.out.println(name);
	} public void printColor() {
		System.out.println(color);
	}public void printAge() {
		System.out.println(age);
	}

}
