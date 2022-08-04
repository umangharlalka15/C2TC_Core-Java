package com.cg.program;

import java.util.Scanner;

public class taxdeduction {

	public static void main(String[] args) {
		double taxable_amt = 0;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the base salary:");
		int base_salary=sc.nextInt();
		
		System.out.println("Enter the house emi:");
		int house_emi=sc.nextInt();

		System.out.println("Enter the education emi:");
		int education_emi=sc.nextInt();
		
		int new_salary=base_salary-house_emi-education_emi;
		System.out.println("Final amount after deducting EMI's: "+new_salary);
		
		if(new_salary>=1000000) 
			taxable_amt = 0.3 * new_salary;	
			
		else if(new_salary>=500000) 
			taxable_amt = 0.2 *new_salary;

		else 
			taxable_amt = 0.05 *new_salary;
			
		System.out.println("Tax to be paid is: "+taxable_amt);
			
	}

}
