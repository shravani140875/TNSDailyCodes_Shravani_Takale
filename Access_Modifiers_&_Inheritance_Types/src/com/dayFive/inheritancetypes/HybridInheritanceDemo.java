package com.dayFive.inheritancetypes;

class Person
{
	long phno;
	String name;
	
	public void PersonDetails()
	{
		System.out.println(name + " " + phno);
	}
}

class Employee extends Person
{
	int empId;
	String position;
	float salary;
	
	public void EmployeeDetails()
	{
		System.out.println(empId + " " + position + " " + salary);
	}
  
}

class Manager extends Employee
{
	String authority;
	
	public void managerAuthority()
	{
	  System.out.println(authority);
	}
}

class Client extends Person
{
	String bond;
	String projects;
	
	public void clientdetails()
	{
	  System.out.println(bond + " " + projects);
	}
	
}

public class HybridInheritanceDemo {
	
	public static void main(String[] args)
	{
	  
	}

}
