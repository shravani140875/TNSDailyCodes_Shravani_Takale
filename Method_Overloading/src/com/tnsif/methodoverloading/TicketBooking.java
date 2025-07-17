package com.tnsif.methodoverloading;

public class TicketBooking {
	
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	public void getStageEvent() {
		System.out.println("------------------------");
		System.out.println("Stage Event: " + stageEvent);
	}
	
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public void getCustomer() {
		System.out.println("Customer: " + customer);
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public void getNoOfSeats() {
		System.out.println("No. Of Seats: " + noOfSeats);
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public void makePayment(Double amount)
	{
		System.out.println("------------------------");
		System.out.println("Amount " + amount + " paid in cash");
	}
	
	public void makePayment(String walletNumber,Double amount)
	{
		System.out.println("------------------------");
		System.out.println("Amount " + amount + " paid in using wallet number " + walletNumber);
	}
	
	public void makePayment(String creditCard,String ccv,String name,Double amount)
	{
		System.out.println("------------------------");
		System.out.println("Holder Name: " + name);
		System.out.println("Amount " + amount + " paid using " + creditCard);
		System.out.println("CCV: " +ccv);
	}

}
