package class09;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		 */
		
		String [] cars = {"Audi","BMW","Mercedes","Honda","Tesla","Infiniti"};
		for (String i:cars) {
			System.out.println(i);
		} System.out.println("----------------");
		
	
		for (int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		

	}

}
