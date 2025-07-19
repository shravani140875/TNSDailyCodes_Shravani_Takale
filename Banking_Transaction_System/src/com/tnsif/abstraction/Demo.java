package com.tnsif.abstraction;

public class Demo {
	
	public static void main(String[] args)
	{
		Account savings = new SavingsAccount(500000);
		
		savings.deposit(700);
		savings.withdraw(560);
		savings.getBalance();
		savings.displayBalance();
		
		Account checking = new CheckingAccount(2000000);
		
		checking.deposit(700);
		checking.withdraw(560);
		checking.getBalance();
		checking.displayBalance();
		
		
		
	}

}
