package com.daySix.usingfinal;

public class FinalMethod {
	
	public void finalMethod()
	{
		System.out.println("This ia default constructor");
	}
	
	final int a = 50;
	
	final void show()
	{
		System.out.println("Value of a: " + a);
	}
	

}

class FinalMethodTest extends FinalMethod
{
	
	
	public static void main(String[] args)
	{
		FinalMethod f = new FinalMethod();
		
		f.finalMethod();
		f.show();
		
	}
}
