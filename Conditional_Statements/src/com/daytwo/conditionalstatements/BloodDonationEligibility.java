package com.daytwo.conditionalstatements;
import java.util.*;

public class BloodDonationEligibility {
	
	public static boolean eligible(int weight,int age,String illness, String recentDonation)
	{
		if(weight > 50 && age > 18 && illness.equals("no") && recentDonation.equals("no"))
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
		 
		 System.out.print("Enter your weight: ");
         int weight = sc.nextInt();
         
         System.out.print("Enter your age: ");
         int age = sc.nextInt();
         
         System.out.print("Had any recent illness?(yes/no): ");
         String illness = sc.nextLine().toLowerCase();
         
         System.out.print("Donated blood in the last 3 months?(yes/no): ");
         String recentDonation = sc.nextLine().toLowerCase();
         
         if(eligible(weight,age,illness,recentDonation))
         {
        	 System.out.println("You are eligible of blood donation");
         }
         else
         {
        	 System.out.println("You are not eligible for blood donation");
         }
         
	}

}
