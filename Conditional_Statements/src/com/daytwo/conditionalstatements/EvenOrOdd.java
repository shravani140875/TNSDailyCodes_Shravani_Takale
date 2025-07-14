package com.daytwo.conditionalstatements;
import java.util.*;

public class EvenOrOdd {
	
	public void evenOrOdd(int num)
	{
		if(num % 2 == 0)
		{
		   System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number id odd");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		EvenOrOdd obj1 = new EvenOrOdd();
		obj1.evenOrOdd(num);
		
			
	}

}
