package com.daytwo.conditionalstatements;
import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num)
	{
		if(num <= 1) return false;
		if(num == 2) return true;
		if(num % 2 == 0) return false;
		
		for(int i = 3; i <= Math.sqrt(num); i += 2)
		{
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num + " is a prime number.");
		}
		else
		{
			System.out.println(num + " is not a prime number.");
		}
	}

}
