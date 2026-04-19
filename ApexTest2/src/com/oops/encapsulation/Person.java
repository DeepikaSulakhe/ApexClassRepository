package com.oops.encapsulation;

public class Person {
	private String personName;
	private int age;
	private String email;
	private double salary;
	
	public Person(String personName, int age, String email, double salary) {
		super();
		this.personName = personName;
		this.age = age;
		this.email = email;
		this.salary = salary;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getPersonName() {
		 return personName;
	}
	public void setPersonName(String personName) {
		if(personName != null) {
			this.personName = personName;
		}else {
			System.out.println("Person Name cannot be null");
		}
	}
	public int  getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age <= 0 || age > 120) {
			System.out.println("In valid age");
		}else {
			this.age = age;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email!= null && email.contains("@")) {
			this.email = email;
		}else {
			System.out.println("Invalid email format");
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary){
		if(salary > 0){
			this.salary = salary;
		}else {
			System.out.println("Invalid salary figure");
		}
	}
	
	public String toString() {
		return "Person Details: {Person Name = '"+personName+"', Age = '"+age+"' , Email = '"+email+"', Salary = '"+salary+"' }";
		 
	}

}
