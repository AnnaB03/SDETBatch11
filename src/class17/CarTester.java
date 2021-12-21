package com.syntax.class17;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car ("Tesla model X","Tesla","Model Y", "Black", 2018, -1, "123",
				-1,300,true); 
		
		//the sequeens of printing in the console is here
		car.printName();
		car.printCarMake();
		
		Car car2 = new Car ("Tesla model X");
		car2.printName();
		
		Car car3 = new Car();
		car3.sayHello();
		

	}

}
