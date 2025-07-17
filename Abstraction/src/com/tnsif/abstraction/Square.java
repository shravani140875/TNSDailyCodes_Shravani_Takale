package com.tnsif.abstraction;

public class Square extends Shape{
	
	private float side;
	
	public Square()
	{
		super();
		this.side=2.0f;
	}
	
	public Square(float side)
	{
		this.side = side;
	}

	@Override
	void calArea() {
	    super.area = side*side;
		
	}
	
	

}
