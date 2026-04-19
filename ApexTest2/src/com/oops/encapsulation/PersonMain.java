package com.oops.encapsulation;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("Sonu", 29, "sonu1993@gmail.com", 180000);
		person.setPersonName("Dipu");
		person.setAge(17);
		person.setEmail("examplegmail.com");
		person.setSalary(0.0);
		
		System.out.println(person);

	}

}
