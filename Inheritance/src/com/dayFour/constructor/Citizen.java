package com.dayFour.constructor;

public class Citizen {
	
	

	private String name;
	private long aadharno;
	private String address;
	private long phno;
	
	public Citizen(String name, long aadharno, String address, long phno) {
		
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}

	public Citizen() {
		System.out.println("Citizen object created");
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}

}
