package class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// 2D array is array of arrays
		
String [][] groceries = {
				
				{"banana", "apple", "mango"}, //0
				{"potato", "tomato"}, //1
				{"milk","cheese","ayran","yogurt"} //2
				};
 for (String [] grocery : groceries) {
	 for (String g:grocery) {
		 System.out.println(g);
	 }
	 System.out.println();
 }

	}

}
