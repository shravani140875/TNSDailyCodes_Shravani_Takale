package com.daytwo.conditionalstatements;
import java.util.Scanner;

public class SimpleATM {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double balance = 1000000.00;
		int choice;
		
		while(true)
		{
			System.out.println("\n\n====Welcome to ATM====");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				System.out.println("Enter amount to withdraw: ");
				double withdrawAmt = sc.nextDouble();
				
				if(withdrawAmt > 0 && withdrawAmt <= balance)
				{
					balance -= withdrawAmt;
					System.out.println("Collect your cash.");
				}
				else
				{
					System.out.println("Insufficient balance or invalid amount.");
				}
				break;
				
			case 2:
				System.out.println("Enter amount to deposit: ");
				double depositAMt = sc.nextDouble();
				
				if(depositAMt > 0)
				{
					balance += depositAMt;
					System.out.println("Amount deposited successfully!!");
				}
				else
				{
					System.out.println("Invalid deposit amount.");
				}
				break;
				
			case 3:
				System.out.println("Your current balance is  " + balance);
				break;
				
			case 4:
				System.out.println("Thank You for using ATM!!! Visit Again!!!");
				
				break;
				
			default:
				System.out.println("Invalid choice! Please select between 1-4");
				break;	
			}
			
		}
	}

}
