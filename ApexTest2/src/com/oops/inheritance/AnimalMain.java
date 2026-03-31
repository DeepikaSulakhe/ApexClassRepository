package com.oops.inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal("Monkey","keekee",2);
		Animal dog = new Dog("Dog","woof",4,"Dalmatian");
		Bird bird = new Bird("Sparrow", "chik-chik",2,false);
		Fish fish = new Fish("Salmon","",0,"Salt");
//		animal.speak();
//		dog.speak();
//		bird.speak();
//		bird.fly();
//		fish.swim();
		
		Animal[] animals = new Animal[4];
		animals[0] = animal;
		animals[1] = dog;
		animals[2] = bird;
		animals[3] = fish;
		for(Animal n: animals) {
			n.speak();	
			}
		}	

	}
