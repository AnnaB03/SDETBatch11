package class09;

public class AllFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {100,200,300,400,500};
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		//to access all elements from array we can use for each loop/advanced for loop/enhance
		System.out.println();
		for (int n:num) {
			System.out.println(n);
			
		}
		String[] color = {"red", "blue", "white"};
		
		for (String col:color) {
			System.out.println(col);
		}
System.out.println("_____________________________________________");
	}

}
