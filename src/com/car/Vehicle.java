package com.car;

public class Vehicle {
	String brand;
	
	double price;
	Vehicle(){
		System.out.println("Default constructor called : ");
		
	}
	Vehicle(String brand,double price){
		System.out.println("parameterized constructor called : ");
		this.brand=brand;
		this.price=price;
	}

}
