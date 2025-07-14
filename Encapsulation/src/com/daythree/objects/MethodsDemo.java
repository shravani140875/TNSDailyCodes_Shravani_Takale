package com.daythree.objects;

public class MethodsDemo {
	
	int m = 23; //instance variable
	
	public static void main(String[] args)
	{
		MethodsDemo obj1 = new MethodsDemo();
		
		obj1.addition();
		obj1.multiply(34, 23);
		
		
	}
	
	//non-parameterized method
	public void addition()
	{
		int x = 10; //local variables
		int y = 20;
		
		int add = x + y;
		System.out.println("Addition of X and Y: " + add);
	}
	
	//parameterized method
	
	public void multiply(int a,int b)
	{
		int mult = a*b;
		System.out.println("Multiplication of a and b: " + mult);
	}

}
