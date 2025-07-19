package com.tnsif.abstraction;

public class Transaction {
	
	private final double transactionFee;

	public Transaction(double fee) {
		
		this.transactionFee = fee;
	}
	
	public final void performTransaction(double amount)
	{
		System.out.println("Transaction initiated.....");
		System.out.println("Amount: $" + amount);
		System.out.println("Transaction Fee: $" +  transactionFee);
		System.out.println("Total Deducted: $" +  (amount + transactionFee));
		System.out.println("Transaction Successful.\n");
	}
	
	public double getTransactionFee()
	{
		return transactionFee;
	}
	
	
	
	

}
