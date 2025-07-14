package com.daytwo.conditionalstatements;
import java.util.Scanner;

public class VotingEligibility {
	
	public boolean isEligible(int age)
	{
		if(age >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VotingEligibility obj1 = new VotingEligibility();
		
		System.out.print("Enter person's age: ");
		int age = sc.nextInt();
		
		if(obj1.isEligible(age))
		{
			System.out.println("The person is eligible for voting.");
		}
		else
		{
			System.out.println("The person is not eligible for voting.");
		}
		

	}

}
