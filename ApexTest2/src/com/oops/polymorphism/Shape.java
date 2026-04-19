package com.oops.polymorphism;

public class Shape {
     String color;
     public Shape(String color) {
		super();
		this.color = color;
	}
	public double area() {
    	 return 0;
     }
     public double perimeter() {
    	 return 0;
     }
     
     public void displayInfo() {
    	 System.out.println("'"+color+"' The value of Area is "+area()+". The value of Perimeter is "+perimeter()+"");
     }
	
	
}

class Circle extends Shape{
	int radius;
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * (radius*radius);	
	}
	
	public double perimeter() {
		return 2* Math.PI * radius;
	}
}

class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(String color,double length,double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	public double area() {
		return (length*width);	
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
}

class Triangle extends Shape{
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	public Triangle(String color,double base,double height,double side1,double side2,double side3) {
		super(color);
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double area() {
		return (0.5 * base*height);	
	}
	
	public double perimeter() {
		return (side1+side2+side3);
	}
	
}

class Square extends Rectangle{

	public Square(String color, double length, double width) {
		super(color, length, width);
	}
	
	public double area() {
		return (width*width);	
	}
	
	public double perimeter() {
		return (4*width);
	}
	
}
