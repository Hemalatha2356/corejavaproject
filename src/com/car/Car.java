package com.car;

public class Car extends Vehicle {
	
	String model;
	String color;
	
	Car(){
		this("honda","green");
		System.out.println("car default consructor called : ");
		
	}
	
	Car(String model,String color){
		
		super("royal feild",567890);
		this.model=model;
		this.color=color;
	}
	void display() {
		
		
		System.out.println("Brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("model : " + model);
		System.out.println("color : " + color);
	}

}
