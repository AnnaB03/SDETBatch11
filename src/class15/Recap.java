package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// 
		
		String str3 = "";
	//String is not recommended because every time it will search the memory and that will slow down the code
		for (int i=0; i<5; i++) {
			str3 = str3+i;
		}
		
		// when we have to change the value of a String variable always use StringBuilder class
				StringBuilder stringBuilder = new StringBuilder();
				for (int i =0;i<5;i++) {
					stringBuilder.append(i);
					
				}
				System.out.println(stringBuilder);
				
				String a = "Me: Look it's not you it's me, I just have some thing i need to work out\r\n";
				
				StringBuilder strBuilder = new StringBuilder(a);
				strBuilder.reverse(); //will reverse the whole thing
				System.out.println(strBuilder);
				

	}

}
