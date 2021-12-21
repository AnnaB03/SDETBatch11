package class10;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets create a 2D array of groceries
		
		String [][] groceries = {
				
				{"banana", "apple", "mango"},
				{"potato", "tomato"},
				{"milk","cheese","ayran","yogurt"}
				};
		System.out.println(groceries.length); // 3 ->three rows = #of arrays
		
		// access yogurt
		System.out.println(groceries [2][3]);
		
		// i want to find how many elements my 1 array has
		System.out.println("# of elements inside 1 array = " +groceries[0].length);
		System.out.println("# of elements inside 2 array = " +groceries[1].length);
		System.out.println("# of elements inside 3 array  = " +groceries[2].length);
		
	// how do we get all elements from 2D array?
		int total = 0;
		for (int i=0; i<groceries.length; i++) { // iterates over array or rows
			for (int j=0; j<groceries[i].length; j++) { // iterates over elements of each single array 
		
			String element = groceries[i][j];
			System.out.println(element);
			if (element.equals("ayran")) {
				System.out.println(i+ " "+j);
			}
			total++;
		}
			System.out.println();
		}
		
		System.out.println("The number of elements is " +total);
		
		
	}

}
 