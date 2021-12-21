package class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] grades = {'A', 'D', 'A', 'B','C'}; //char always uses ''
		for (char i:grades) {
			System.out.println(i);
			
		}
		System.out.println("-----------");
		
		//reverse
		
		for (int i=grades.length-1; i<=0; i--) {
			System.out.print(grades[i] + " ");
		}
		

	}

}
