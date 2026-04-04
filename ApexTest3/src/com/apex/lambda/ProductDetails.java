package com.apex.lambda;

import java.util.ArrayList;

public class ProductDetails {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Laptop");
		list.add("Phone");
		list.add("Tablet");
		list.add("Monitor");
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Headphones");
		
		// Collections.sort(list); gives same result
		list.sort((s1,s2) -> s1.compareTo(s2));
		
		System.out.println("Alphabetical: "+list);
		 
		list.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));
		System.out.println("\nBy length: " +list);
		
		Runnable t = ()-> System.out.println("\nProcessing product list...");
		Thread t1 = new Thread(t);
		t1.start();
		
		list.removeIf((s1) -> s1.length() > 6);
		System.out.println("\nAfter removeIf (length < 6): " +list);
		
	}

}
