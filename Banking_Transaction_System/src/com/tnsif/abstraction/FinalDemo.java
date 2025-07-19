package com.tnsif.abstraction;

public class FinalDemo {
	
	public static void main(String[] args)
	{
		Transaction t1 = new Transaction(700);
		Transaction t2 = new Transaction(700);
		
		t1.performTransaction(900);
		t2.performTransaction(500);
	}

}
