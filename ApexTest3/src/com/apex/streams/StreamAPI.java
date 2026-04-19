package com.apex.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(25000, 42000, 15000, 68000, 31000, 72000, 19000, 55000);
		
		System.out.println("Ascending: "+salaries.stream().sorted().toList());
		System.out.println("Descending: "+ salaries.stream().sorted(Comparator.reverseOrder()).toList());
		System.out.println("Total salary: "+salaries.stream().reduce(0, Integer::sum));
		System.out.println("Count above 40000: " +salaries.stream().filter(i-> i>40000).count());
		int res = salaries.stream().filter(i-> i > 60000).findFirst().orElse(0);
		System.out.println("First salary > 60000: "+res);
		double average = salaries.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Average salary: "+average);

	}

}
