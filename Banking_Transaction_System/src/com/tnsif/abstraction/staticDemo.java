package com.tnsif.abstraction;

public class staticDemo {
	
	public static void main(String[] args)
	{
		Bank acc1 = new Bank();
		Bank acc2 = new Bank();
		Bank acc3 = new Bank();
		Bank acc4 = new Bank();
		
		System.out.println("Total bank accounts created: " + Bank.getTotalAccounts());
	}
	
	
	

}
