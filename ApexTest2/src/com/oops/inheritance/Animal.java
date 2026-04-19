package com.oops.inheritance;

public class Animal {
	String name;
	String sound;
	int legs;
	
	public Animal(String name, String sound, int legs) {
		super();
		this.name = name;
		this.sound = sound;
		this.legs = legs;
	}
	
	public Animal(String name2) {
		// For fish class as it doesn't need no legs or sound
	}

	public void speak() {
		System.out.println(""+name+" says "+sound+"");
	}
	
}

class Dog extends Animal {
		String breed;

		public Dog(String name, String sound, int legs,String breed) {
		super(name, sound, legs);
		this.breed = breed;
		}
		
		public void speak() {
			System.out.println(""+name+" says "+sound+" and wags tail");
		}
	
}

class Bird extends Animal{
	boolean canFly = false;
	
	public Bird(String name, String sound, int legs, boolean canFly) {
		super(name, sound, legs);
		this.canFly = canFly;
	}
	
	public void speak() {
		System.out.println(""+name+" says "+sound+"");
	}
	
	public void fly() {
		if(canFly) {
			System.out.println(""+name+" can fly");
		}else {
			System.out.println(""+name+" cannot fly");
		}
	}
}

class Fish extends Animal{
	String waterType;
	public Fish(String name, String sound, int legs, String waterType) {
		super(name,sound,legs);
		this.waterType = waterType;
	}
	public void speak() {
		System.out.println(""+name+" is a Fish. It cannot make sound");
	}
	
	public void swim() {
		System.out.println(""+name+" swims in "+waterType+" water");
	}	
}
