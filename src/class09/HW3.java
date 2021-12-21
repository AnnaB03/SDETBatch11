package class09;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create an array to store double values and then print those in reverse order
		 *
		 */
		
		double[] num = {2.22,3.33,4.44,5.55,6.66};
		for (int i=num.length-1; i>=0;i--) {
			System.out.println(num[i]);
		}
		System.out.println("---------------");
		
		for (int i=4; i>=0;i--) { //i=4 -- number of numbers in the row
			System.out.println(num[i]);
		}
		
		//we cannot use enhanced for loop to travel back in an array
		//for each loop always loops 1 direction: start->end

	}

}
