package com.syntax.reviewclass6;

public class Student {
	
	String name;
	String gender;
	int studentId;
	String course;
	String grade;
	String division;
	
	//void means non returned typed
	void sleep () {
		System.out.println(name + " sleeps a lot");
		
	}
	
	void study() {
		System.out.println(name + " study in "+course);
		
	}
	void studentInformation () {
		System.out.println(name + " secured "+ division + " division");
	}

}
