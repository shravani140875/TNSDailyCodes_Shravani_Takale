package com.tnsif.methodoverriding;

public class Circle extends Shape{
	
	private double radius;
	
    //constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//override draw method for circle
	
	@Override
	public void draw()
	{
		System.out.println("Drawing a circle with radius " + radius);
	}
	
	//erase draw method for circle
	
		@Override
		public void erase()
		{
			System.out.println("Erasing a circle with radius " + radius);
		}
	

}
