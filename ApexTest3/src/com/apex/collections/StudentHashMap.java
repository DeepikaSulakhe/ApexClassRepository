package com.apex.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		Map<String , Integer> markSheet = new HashMap<String, Integer>();
		markSheet.put("Alice", 88);
		markSheet.put("Bob", 74);
		markSheet.put("Carol", 95);
		markSheet.put("David", 60);
		markSheet.put("Eva", 82);
		
		System.out.println("Bob's Marks: "+markSheet.get("Bob"));
		System.out.println("\nFrank's Marks: "+markSheet.getOrDefault(markSheet.get("Frank"), 0));
		markSheet.put("David", 75);
		//System.out.print(markSheet);
		System.out.println("\nCarol Present: "+markSheet.containsKey("Carol"));
		for(Map.Entry<String, Integer> entry: markSheet.entrySet()) {
			System.out.println("\nName:" +entry.getKey()+" Marks: "+entry.getValue());
		}
		System.out.println("\nTotal entries: "+ markSheet.size());
	}

}
