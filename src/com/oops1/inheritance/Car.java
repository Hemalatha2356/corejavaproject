package com.oops1.inheritance;

public class Car extends Vehicle {
	Car(){
		start();
	}
	
	void drive() {
		System.out.println(" car driver");
	}

	public static void main(String[] args) {
		
		Car v1  = new Car();
	     v1.drive();
	    

	}

}
