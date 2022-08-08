package com.cp.fundamentals;

public class SwitchStringExample {

	public static void main(String[] args) {
		String CurrentDay="Sunday";
		
		switch(CurrentDay){
			
			case "Monday":
				System.out.println("First Day if the week");
				break;
			case "Tuesday":
				System.out.println("Second Day of teh week");
				break;
			case "Wednesday":
				System.out.println("Third Day of the week");
				break;
			case "Thrusday":
				System.out.println("fourth Day of the week");
				break;
			case "Friday":
				System.out.println("Fifth Day of the week");
				break;
			case "Saturday":
				System.out.println("Sixth Day of the week");
				break;
			case "Sunday":
				System.out.println("last Day of the week / Weekend");
				break;
				
				
			
		}

	}

}
