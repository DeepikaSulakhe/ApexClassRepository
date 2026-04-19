package com.oops.polymorphism;

public class ShapesMain {

	public static void main(String[] args) {
		//Shape shape = new Shape("Red");
		Shape circle = new Circle("Circle- Orange",7);
		Shape rectangle = new Rectangle("Rectangle- Green", 10.5,4.2);
		Shape triangle = new Triangle("Triangle- Yellow", 5.5,3.2,5.5,4.0,4.0);
		Shape square = new Square("Square- Purple", 10.5,4.2);
//		System.out.println("The values of Circle are: ");
//		circle.displayInfo();
//		System.out.println("The values of Rectangle are: ");
//		rectangle.displayInfo();
//		System.out.println("The values of Triangle are: ");
//		triangle.displayInfo();
//		System.out.println("The values of Square are: ");
//		square.displayInfo();
		
		Shape[] shapes = new Shape[4];
		shapes[0] = circle;
		shapes[1] = rectangle;
		shapes[2] = triangle;
		shapes[3] = square;
		
		for(Shape n : shapes) {
			//System.out.println("+n.+");
			n.displayInfo();
		}

	}

}
