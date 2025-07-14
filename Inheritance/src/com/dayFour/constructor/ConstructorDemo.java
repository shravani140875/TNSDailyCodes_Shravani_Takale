package com.dayFour.constructor;
import java.util.Scanner;

public class ConstructorDemo {
	
	 
	  private String name;
	  private int id;
	  private int age;
	
	//parameterized constructor
	
	public ConstructorDemo(String name,int id,int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
    }
	
	public void getName()
	{
		System.out.println("Customer name: " + name);
	}
	
	public void getId()
	{
		System.out.println("Customer id: " + id);
	}
	
	public void getAge()
	{
		System.out.println("Customer age: " + age);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		ConstructorDemo obj1 = new ConstructorDemo(name,id,age);
		
		obj1.getName();
		obj1.getId();
		obj1.getAge();
		
		
	}

}
