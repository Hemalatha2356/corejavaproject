package com.oops1.inheritance1;

public class Shape {
	//overloading circle
	void area(int radius) {
		System.out.println("Area of " + 3.14 *(radius*radius));
	}
	//overloading retangle
	void area(int length,int breadth) {
		System.out.println("Area of " + (length * breadth));
	}

}
