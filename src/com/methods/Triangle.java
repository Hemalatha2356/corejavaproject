package com.methods;

//area of triangle 0.5*base*height
//rectangle length*breadth
//square side* side
//circle pI * r*r
import java.util.Scanner;
public class Triangle {
	Scanner sc = new Scanner(System.in);
	
	 double findAreaOfTriangle(double base, double height) {
		 double AreaOfTriangle = 0.5*base*height;
		 return AreaOfTriangle;
		
	}
	 double findAreaOfCircle(double r) {
		 double AreaOfCircle = Math.PI * r*r;
		 return AreaOfCircle;
		 
	 }
	 double Square(double s) {
		 double Square = s*s;
		 return Square;
	 }
	 double rectangle (double length,double breadth) {
		 double rectangle = length*length;
		 return rectangle;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle s1 = new Triangle();
		System.out.println("******finding area of triangle********");
		System.out.println("Enter a base : ");
		double b = sc.nextDouble();
		System.out.println("enter a height : ");
		double h = sc.nextDouble();
		double AreaOfTriangle = s1.findAreaOfTriangle(b,h);
		System.out.println("Area of triangle : " + AreaOfTriangle);
		
		System.out.println("*********Area of circle**********");
		System.out.println("Enter radius : ");
		double r = sc.nextDouble();
		double AreaOfCircle = s1.findAreaOfCircle(r);
		System.out.println("Area of circle : " + AreaOfCircle);
		
		System.out.println("**********Area of Square***********");
		System.out.println("Enter a value : ");
		double s = sc.nextDouble();
		double result = s1.Square(s);
		System.out.println("square " + result);
		
		System.out.println("********Area of rectangle ********* ");
		System.out.println("Enter a length : ");
		double length = sc.nextDouble();
		System.out.println("Enter a breath : ");
		double breath = sc.nextDouble();
		System.out.println("rectangle : " + (length*breath));
		
	}

}
