package com.methods;
//Areaof trapezium a=(s+s)*h/2
//Areaof Rhombus A = d1*d2/2;
//volumeof cube v=s*s*s;
//volumeof cuboid  v= l*b*h
//volume of cylinder  v=pI*R*R*h;
import java.util.Scanner;
public class TestDemoMethods2 {
	Scanner sc = new Scanner(System.in);
	
	double areaOfTrapezium(double side1,double side2, double height) {
		double Trapezium = (side1+side2)*height/2;
		return Trapezium;
	}
	
	double areaOfRhombus(double d1,double d2) {
		double Rhombus = d1*d2/2;
		return Rhombus;
	}
	
	double volumeOfCube(double S) {
		double Cube = S*S*S;
		return Cube;
	}
	double volumeOfCuboid(double length,double breadth,double height) {
		double Cuboid = length*breadth*height;
		return Cuboid;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestDemoMethods2 t1 = new TestDemoMethods2();
		System.out.println("*******AreaOfTrapezium***********");
		System.out.println("Enter a side1 : ");
		double side1 = sc.nextDouble();
		System.out.println("Enter a side2 : ");
		double side2 = sc.nextDouble();
		System.out.println("enter a height : ");
		double height = sc.nextDouble();
		double result = t1.areaOfTrapezium(side1,side2,height);
		System.out.println("trapezium " + result);
		
		System.out.println("**********AreaOfRhombus**********");
		
		System.out.println("Enter a d1 : ");
		double d1 = sc.nextDouble();
		System.out.println("Enter a d2 : ");
		double d2 = sc.nextDouble();
		double result1 = t1.areaOfRhombus(d1, d2);
		System.out.println("AreaOfRhombus : " + result1);
		
		System.out.println("**********VolumeOfCube**********");
		System.out.println("Enter a sides : ");
		double sides = sc.nextDouble();
		double Cube = t1.volumeOfCube(sides);
		System.out.println("AreaOfCubes : " + Cube);
		
		System.out.println("*******VolumeOfCuboid**********");
		System.out.println("Enter a length : ");
		double length = sc.nextDouble();
		System.out.println("Enter a breadth : ");
		double breadth = sc.nextDouble();
		System.out.println("Enter a height : ");
		double height1 = sc.nextDouble();
		double result2 = t1.volumeOfCuboid(length, breadth, height1);
		System.out.println("VolumeOfCuboid " + result2 );
		
		
		
		
		
	}

}
