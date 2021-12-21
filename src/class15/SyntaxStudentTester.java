package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SyntaxStudent Anna = new SyntaxStudent();
		Anna.name = "Anna";
		Anna.id = "12345";
		Anna.calculateFee();
		//System.out.println(Anna.school); //not recommended
		System.out.println(SyntaxStudent.school);//always use the name of the class and the name of the variables

	}

}
