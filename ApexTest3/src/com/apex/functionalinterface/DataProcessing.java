package com.apex.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DataProcessing {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = i -> i % 2 == 0; 
		Predicate<Integer> isGreaterThan50 = i-> i > 50;
		
		System.out.println("48 is even: " +isEven.test(48)+ " 48 > 50: "+isGreaterThan50.test(48));
		System.out.println("72 is even: " +isEven.test(48)+ " 72 > 50: "+isGreaterThan50.test(72));
		System.out.println("72 is even AND > 50: "+ isEven.and(isGreaterThan50).test(72));
		
		Function<String ,String> addGreeting = name -> "Hello," + name + "! ";
		
		System.out.print(addGreeting.apply("Alice") );
		System.out.println(addGreeting.apply("Bob"));
		
		Consumer<String> printUpperCase = s -> System.out.print(s.toUpperCase()+" ");
		
		List<String> list = Arrays.asList("java", "streams", "lambda");
			list.forEach(printUpperCase);
		System.out.println();
		Supplier<Double> randomScore = ()-> Math.random() * 100;
			
		for(int i = 1; i<= 3; i++) {
			System.out.print("Score "+i+": "+randomScore.get()+" ");
			
		}
  }
}
