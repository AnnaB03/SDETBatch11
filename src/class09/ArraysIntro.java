package class09;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		System.out.println(num);
		
		int[] array = new int[4];
		array[0]=12;
		array[1]=10;
		array[2]=13;
		array[3]=(int)14.99;
		
		System.out.println(array[2]+array[0]);
		System.out.println(array[3]);
				
		//i need to create an array that will hold 3 elements of double type of values
		
		double[] arr=new double[3];//storing 3 elements inside an array that we named arr
		
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		//can i replace value from an array?
		arr[1]=100.99;
		System.out.println("after changing the value of an element "+ arr[1]);
		
		String[] colors=new String[400000];
		
		colors[1]="blue";
		colors[2]="black";
		colors[3]="yellow";
		//colors[4]="green"; array index out of bounds exception
		
		System.out.println("size of array is "+colors.length);
		
		System.out.println(colors[0]);
		
		byte[] smallArray = new byte [89997];	
				

	}

}
