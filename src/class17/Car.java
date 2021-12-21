package com.syntax.class17;

public class Car {
	
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;
	
	public Car () { //always create a 0 constructor first
		
	}
	public Car (String carName) {
		name=carName;
	} 
	public Car (String carName, String carMake) {
		name = carName;
		make = carMake;
	}
	
	public Car (String carName, String carMake,String carModel,String carColor,int carYear,
			int carEngineCC, String carVIN, int carMileage, int carMaxSpeed, boolean carSunroof) {
		name = carName;
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		engineCC = carEngineCC;
		engineCC = carEngineCC;
		VIN  = carVIN;
		mileage=carMileage;
		maxSpeed=carMaxSpeed;
		sunroof = carSunroof;
		
	} public void printName() {
		System.out.println(name);
	} public void sayHello() {
		System.out.println("Hello");
	} public void printCarMake() {
		System.out.println(make);

}
}
