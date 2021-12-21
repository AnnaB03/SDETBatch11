package class09;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array on integers and calculate the sum of all elements 
		 * in an array
		 */
		int num[] = {2,3,4,5,6};
		int sum=0;
		int i;
		for (i=0; i<num.length;i++)
			sum+=num[i];
		System.out.println(sum);
		
	
	sum=0;
	for (int a:num) {
		sum+=a;
	} System.out.println("The sum of all the integers = " + sum);

	}
	}


