package com.tnsif.abstraction;

public class Bank {
	
	static int totalAccounts = 0;

	public Bank()
	{
		 totalAccounts++;
	}
	
	public static int getTotalAccounts()
	{
		return totalAccounts;
	}
	
	
	

}
