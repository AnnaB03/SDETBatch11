package com.syntax.class16;

public class AccessModifierDemo1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiersDemo1 am = new AccessModifiersDemo1();
		//am.name = "Nabil"; cannot access 
		am.age = 22;
		am.salary = 120000;
		//am.displayName;
		am.displayAge();
		am.displaySalary();

	}

}
