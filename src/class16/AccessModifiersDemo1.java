package com.syntax.class16;

public class AccessModifiersDemo1 {
	//public,protected and private
	
	private String name; //can be accessed only in AccessModifiersDemo1 class
	int age; //default access - we dont specify = accessible only in the same package
	public double salary; //can be accesed everywhere inside the JavaBasics project
	
	private void displayName () {
		System.out.println(name);
	}
	void displayAge() {
		System.out.println(age);
	}
	public void displaySalary() {
		System.out.println(salary);
	}
	public static void main(String[] args) {
		AccessModifiersDemo1 am = new AccessModifiersDemo1();
		am.name = "Nabil";
		am.age = 22;
		am.salary = 120000;
		am.displayName();
		am.displayAge();
		am.displaySalary();
		
		
		
	}
 
}
