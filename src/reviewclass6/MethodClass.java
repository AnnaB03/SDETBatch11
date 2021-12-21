package com.syntax.reviewclass6;

public class MethodClass {
	//void - return type of method
	//Statement1 = executes once before loop statement - int i=0
	//Statement2 = condition to be applied in the code - i<10
	//Statement3 = executes once condition finishes - i++
 	
	int i =10;
	
	void welcomeBatch11 () {
		System.out.println("Batch 11 has an immence potential");
	}
	void printMultipleEntities () {
		for (int i = 0; i<10; i++) {
			System.out.println(i);
		}
	}
	
	void takeArguments(String name) {
		System.out.println(name + " is a good student");
	}
	
	void studentRecord (String name, int id, String course, String division) {
		System.out.println(name + " is having the id number "+ id + " enrolled for the course "+ course + " and secured "+ division + " division in last exams" );
	}

} 

