package com.tnsif.methodoverloading;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the stage event: ");
		String stageEvent = sc.nextLine();
		
		System.out.print("Enter your name: ");
		String customer = sc.nextLine();
		
		System.out.print("Enter the no. of seats: ");
		int noOfSeats = sc.nextInt();
		
		TicketBooking t = new TicketBooking(stageEvent,customer,noOfSeats);
		
		t.getStageEvent();
		t.getCustomer();
		t.getNoOfSeats();
		
		System.out.println("------------------------");
		System.out.println("Modes Of Payment");
		System.out.println("1.Cash");
		System.out.println("2.Wallet");
		System.out.println("3.Credit Card");
		System.out.print("Enter your choice: ");
		int mode = sc.nextInt();
		
		
		
			switch(mode)
			{
			case 1:
				System.out.println("Enter cash amount: ");
				Double amount1 = sc.nextDouble();
				t.makePayment(amount1);
				break;
				
			case 2:
				System.out.print("Enter wallet amount: ");
				Double amount2 = sc.nextDouble();
				sc.nextLine();
				System.out.print("Enter wallet number: ");
				String walletNumber= sc.nextLine();
				t.makePayment(walletNumber, amount2);
				break;
				
			case 3:
				 System.out.print("Enter credit card amount: ");
	                double amount3 = sc.nextDouble();
	                sc.nextLine(); 
	                System.out.print("Enter type of credit card: ");
	                String creditCard = sc.nextLine();
	                System.out.print("Enter credit card holder name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter CCV: ");
	                String ccv = sc.nextLine();
	                t.makePayment(creditCard, ccv, name, amount3);
	                break;
			}
		
	}

	
}
