package com.dayFive.accessmodifiers;

public class ExecutorDemo {
	
	public static void main(String[] args)
	{
		Base b = new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
	}

}
