package class10;

public class AllElementsFromArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numbers = {
				{100,200,300},
				{9,8,7},
		};
				System.out.println("Size of 2D array = " + numbers.length);
				System.out.println(numbers [1][1]); //8
				
				System.out.println(" get all elements using enhanced for loop ");
				
				for (int [] nums:numbers) {
					for (int n:nums) {
						System.out.println(n + " ");
					}System.out.println();
					
					System.out.println(" get all elements using regular for loop ");
					
					for (int i=0; i<numbers.length; i++) {
						for (int j=0; j<numbers[i].length; j++) {
							int elements = numbers[i][j];
							System.out.print(elements + " ");
						}
						System.out.println();
					}
				}
		}

	}


