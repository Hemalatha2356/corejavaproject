package com.oops1.inheritance1;

public class Circle extends Shape{
	@Override
	void area(int radius) {
		System.out.println("circle area : " + 3.14 * (radius*radius));
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.area(10);
		c1.area(12, 9);

	}

}
