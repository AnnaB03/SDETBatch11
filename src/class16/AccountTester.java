package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		//a1.getBalance = 12345; not allowed
		a1.setUserName("anna");
		a1.setPassword("pass12345");
		a1.getBalance("anna", "pass12345");
		
		

	}

}
