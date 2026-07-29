package com.fundamentals;

public class Rectangle {
	void calculateArea(int length, int breath) {
		breath = length * breath;
		System.out.println("length " + length);
		System.out.println("breath " + breath);
	}

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle();
		t1.calculateArea(5, 3);
	}

}
