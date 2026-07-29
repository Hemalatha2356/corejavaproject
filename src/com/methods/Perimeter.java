package com.methods;
//perimeter of rectangle 2*(l+b)
//perimeter of square formulas (4* sides)
//perimeter of a triangle.  (side*s*s)
//Find the area of a parallelogram. (base*height)
import java.util.Scanner;
public class Perimeter {
	Scanner sc = new Scanner(System.in);
	double findperimeterRectangle(double length,double breadth) {
		double perimeterrectangle = 2* (length+breadth);
		return perimeterrectangle;
	}
	double findPerimeterSquare(double s) {
		double perimeter = 4*s;
		return perimeter;
		
	}
	double perimeteroftriangle(double side1, double side2,double side3){
		double perimeteroftriangle = side1*side2*side3;
		return perimeteroftriangle;
	}
	double Areaofparallelogram(double base,double height) {
		double parallelogram = base*height;
		return parallelogram ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perimeter t1 = new Perimeter();
		System.out.println("*********AreaofPerimeterRectangle*********");
		System.out.println("Enter length : ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth = sc.nextDouble();
		double result = t1.findperimeterRectangle(length,breadth);
		System.out.println("perimeter of rectangle : " + result);
		
		System.out.println("**********perimeterofSquare************");
		System.out.println("Enter a squarenumber : ");
		double square = sc.nextDouble();
		double s = t1.findPerimeterSquare(square);
		System.out.println("perimeterofsquare : " + s);
		
		System.out.println("*********perimeteroftriangle*********");
		System.out.println("enter a side1 : ");
		double side1 = sc.nextDouble();
		System.out.println("enter a side2 : ");
		double side2 = sc.nextDouble();
		System.out.println("enter a side3 : ");
		double side3 = sc.nextDouble();
		double sides = t1.perimeteroftriangle(side1, side2, side3);
		System.out.println("perimeteroftriangle : " + sides);
		
		System.out.println("***********Areaofparallelogram**********");
		System.out.println("Enter a base : ");
		double base = sc.nextDouble();
		System.out.println("Enter a height : ");
		double height = sc.nextDouble();
		double result1 = t1.Areaofparallelogram(base,height);
		System.out.println("Areaofparallelogram : " + result1);
		

	}

}
