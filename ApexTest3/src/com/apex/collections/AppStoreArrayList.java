package com.apex.collections;

import java.util.ArrayList;
import java.util.List;


public class AppStoreArrayList {

	public static void main(String[] args) {
		List<String> tasks = new ArrayList<String>();
		tasks.add("Buy groceries");
		tasks.add("Read a book");
		tasks.add("Exercise");
		tasks.add("Call mom");
		tasks.add("Pay bills");
		int i = 1;
		for(String task: tasks) {
			System.out.print( i+". " + task +" ");
			i++;
		}
		tasks.remove("Exercise");
		tasks.remove(0);
		tasks.add(1, "Study Java");
		System.out.println("\nAfter the additions and removals : ");
		//tasks.stream().forEach(task -> System.out.print(task+", "));
		int j =1;
		for(String task: tasks) {
			System.out.print( j+". " + task +" ");
			j++;
		}
		System.out.println("\nPay bills present: "+ tasks.contains("Pay bills") );
		
		System.out.println("Final List: "+tasks+"\tsize: " +tasks.size());
		

	}

}
