package com.tnsif.abstraction;

abstract public class Account {
	
	double balance;
	
	public Account(double balance) {
	       this.balance = balance;
	}
	
	public abstract void deposit(double balance);
	public abstract void withdraw(double balance);
	public abstract double getBalance();
	
	public void displayBalance()
	{
		System.out.println("Currebt Balance: $" + balance);	
    }
	

}
