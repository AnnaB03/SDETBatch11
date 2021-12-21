package class10;

import java.util.Scanner;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i want to create an array and store elements using Scanner
		
		//String[] cars = {};
		//String[] cars = new String[];
		
		Scanner scan = new Scanner (System.in);
		System.out.println("How many elements do you want to store inside array of cars");
		
		int size=scan.nextInt();
		String[] cars = new String [size];
		//storing elements inside an array of cars
		for (int i=0; i<cars.length; i++) {
			System.out.println("Please enter your cars");
			cars [i] = scan.next();
			
		}
		//retrieve all stored element
		for (String a:cars) {
			System.out.print(a + " ");
		}

	}

}
