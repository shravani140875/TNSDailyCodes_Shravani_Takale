package com.dayFour.inheritance;

public class LevelOneEmployee extends Employee {

	private int noofShares;
	private String autority;
	
	public LevelOneEmployee(String name, long contactNo, String deptName, long baseSalary, int noofShares,
			String autority) {
		super(name, contactNo, deptName, baseSalary);
		this.noofShares = noofShares;
		this.autority = autority;
	}

	public int getNoofShares() {
		return noofShares;
	}

	public void setNoofShares(int noofShares) {
		this.noofShares = noofShares;
	}

	public String getAutority() {
		return autority;
	}

	public void setAutority(String autority) {
		this.autority = autority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [noofShares=" + noofShares + ", autority=" + autority + super.toString() +"]";
	}
	
	

}
