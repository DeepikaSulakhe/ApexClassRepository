package com.apex.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		divide(10,2) ;	
		divide(5,0);
		
		String str = "abc";
		try {
			Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println("\nError: Invalid number format.");
		}
	}

	private static double divide(int a, int b) {
		double res = 0.0;
		try {
			res = a / b;
			System.out.println("Result: "+res);
			return res;
		}catch(ArithmeticException e) {
			System.out.println("\nError: Cannot divide by zero.");
			
		}
		finally {
			System.out.println("\n--- Operation complete ---");
		}
		System.out.println("\nResult: "+res);
		return res;
		
	}

}
