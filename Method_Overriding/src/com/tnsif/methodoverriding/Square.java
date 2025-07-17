package com.tnsif.methodoverriding;

public class Square extends Shape {
	
	private double side;

	//constructor
	public Square(double side) {
		super();
		this.side = side;
	}
	
	//override draw method for square
	
		@Override
		public void draw()
		{
			System.out.println("Drawing a square with side " + side);
		}
	
		//override draw method for square
		
		@Override
		public void erase()
		{
			System.out.println("Erasing a square with side " + side);
		}
	

}
