package com.daySeven.overloading;

public class Operations {
	
	//check whether number is Palindrome or not
	
	public static boolean isPalindrome(long number)
	{
		long rev = 0;
		long dummyNumber = number;
		
		while(number != 0)
		{
			rev = rev * 10 + number % 10;
			number /= 10;
		}
		
		return dummyNumber == rev;
	}
	
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
	
	public static void main(String[] args)
	{
		long number = 34567;
		
		System.out.println("Given number is palindrome: " + isPalindrome(number));
		
		String str = "";
		System.out.println("Given string is palindrome: " + isPalindrome(str));
	}

}
