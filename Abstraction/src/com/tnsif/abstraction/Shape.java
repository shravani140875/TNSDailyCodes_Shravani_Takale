package com.tnsif.abstraction;

abstract public class Shape {
	
	protected float area;
	
	//abstract method
	abstract void calArea();
	
	//concrete method
	
    void show()
	{
		System.out.println("Area of Shape is " + area);
	}
	
	
	

}
