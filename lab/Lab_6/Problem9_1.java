/* file: Problem9_1.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: April 27, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */


public class Problem9_1 {
	
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4, 40);

	
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("The Width is    " + rectangle1.width);
		System.out.println("The Height is    " + rectangle1.height);
		System.out.println("The Area is      " + rectangle1.getArea());
		System.out.println("The Perimeter is " + rectangle1.getPerimeter());

		
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("The width is     " + rectangle2.width);
		System.out.println("The Height is    " + rectangle2.height);
		System.out.println("The Area is     " + rectangle2.getArea());
		System.out.println("The Perimeter is " + rectangle2.getPerimeter());
	}
}

class Rectangle {
	double width;	
	double height;	

	
	Rectangle() {
		width = 1;
		height = 1;
	} 

	
	Rectangle(double newW, double newH) {
		width = newW;
		height = newH;
	}


	double getArea() {
		return width * height; 
	}

	
	double getPerimeter() {
		return 2 * (width + height);
	}
}