package com.constructor;

public class Car {
	String brand;
	String model;
	double price;
	
	Car(){
		System.out.println("no args constructor ");
		brand="honda";
	}
	Car(String brand,String model,double price){
		System.out.println("******parameter constructor*********");
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	void show() {
		System.out.println("car brand : " + brand);
		System.out.println("car model : " + model);
		System.out.println("car price : " + price);
	}
	

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.show();
		Car s1 = new Car("Honda","City",56789);
		s1.show();
		
		
		
		
	

	}

}
