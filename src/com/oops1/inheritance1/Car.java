package com.oops1.inheritance1;

public class Car extends Vechicle{
	
	int speed=100;
	@Override
	void display() {
		System.out.println("car speed :" + speed);
	}

	public static void main(String[] args) {
		Vechicle v1 = new Car();
		
		System.out.println("variable speed " + v1.speed);
		v1.display();
		
	}

}
