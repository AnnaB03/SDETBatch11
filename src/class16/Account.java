package com.syntax.class16;

public class Account {
	
	private String username;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance = 1000000;
	
	public void setUserName(String AccountUserName) { // you can access your private data if you can meet the conditions of the methods
		if (AccountUserName.length()<16) {
			username = AccountUserName;
			
		} else {
			System.out.println("Username of this lenght is not allowed");
		}
	}
	public void setPassword (String accountPass) {
		if (accountPass.length()<16) {
			password = accountPass;
		}else {
			System.out.println("error");
		}
	}
	public void getBalance (String AccountUserName, String accountPassword) {
		if (username.equals(AccountUserName)&& password.equals(accountPassword)) {
			System.out.println(accountBalance);
		} else {
			System.out.println("error");
		}
	}
	
	

}
