package com.dayFour.constructor;

public class Student extends Citizen {
	
	private int rollno;
	
	private String collegeName;
	
	public Student() {
		super();
	}

	public Student(String name, long aadharno, String address, long phno, int rollno, String collegeName) {
		super(name, aadharno, address, phno);
		
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	}
	

}
