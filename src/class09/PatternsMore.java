package class09;

public class PatternsMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int r=1;r<4;r++) {
			for (int c=1;c<=5;c++);
			
		 System.out.println(r+ " ");
		} System.out.println();

	 for (int r=5;r>=1;r--) { //controls rows
		for (int c=1;c<=4;c++) { //controls columns
			System.out.print(r+ " ");
		} System.out.println();
	}System.out.println();
	
	 for (int r=5;r>=1;r--) { //controls rows
			for (int c=1;c<=4;c++) { //controls columns
				System.out.print(c+ " ");
			} System.out.println();
		}

	System.out.println();
	
	 for (int r=5;r>=1;r--) { //controls rows
			for (int c=4;c>=1;c--) { //controls columns
				System.out.print(c+ " ");
			} System.out.println();
		}

}}
