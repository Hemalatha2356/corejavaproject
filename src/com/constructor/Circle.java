package com.constructor;

public class Circle {
	double radius;
	Circle(){
		System.out.println("no arg constructor : ");
		radius=9;
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	void display() {
		System.out.println("enter a radius : " + radius);
		double Area = Math.PI*radius*radius;
		double Circumference = 2*Math.PI*radius;
		
		System.out.println("area of Circle " + Area);
		System.out.println("circumference of circle : " + Circumference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Circle c = new Circle();
	 c.display();
	 Circle c1 = new Circle(34);
	 c1.display();

	}

}
