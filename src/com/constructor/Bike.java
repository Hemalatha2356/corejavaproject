package com.constructor;


public class Bike {
	
	String brand;
	String model;
	String color;
	int price;
	int year;
	double milage;
	
	Bike(){
		brand="vcube";
		model="java";
		color="green";
		price=789000;
		year = 2026;
		milage=3.5;
		
		
		System.out.println("no - arg constuctor : ");
	}
	Bike(String brand){
		System.out.println("one - arg constructor called");
		this.brand=brand;
	}
	
	Bike(String brand,String model){
		System.out.println("two - arg constructor called");
		this.brand=brand;
		this.model=model;
		
	}
	
	Bike(String brand,String model,String color){
		System.out.println("three - arg constructor called");
		this.brand=brand;
		this.model=model;
		this.color=color;
		
	}
	Bike(String brand,String model,String color,int price){
		System.out.println("four - arg constructor called");
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		
	}
	
	Bike(String brand,String model,String color,int price,int year){
		System.out.println("fivth arg constructor called");
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.year=year;
		
	}
	
	Bike(String brand,String model,String color,int price,int year,double milage){
		System.out.println("sixth arg constructor called");
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.year=year;
		this.milage=milage;
		
	}
	
	
	
	
	
	void show() {
		System.out.println("*********************************");
		System.out.println("bike brand : " + brand);
		System.out.println("bike model : " + model);
		System.out.println("bike color : " + color);
		System.out.println("bike price : " + price);
		System.out.println("bike year : " + year);
		System.out.println("bike milage : " + milage);
		System.out.println("*********************************");
		
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b = new Bike();
		b.show();
		Bike b1 = new Bike("royal enfeild");
		b1.show();
		Bike b2 = new Bike("royal enfeild","yamaha");
		b2.show();
		Bike b3 = new Bike("royal enfeild","yamaha","black");
		b3.show();
		Bike b4 = new Bike("royal enfeild","yamaha","black",350000);
		b4.show();
		Bike b5 = new Bike("royal enfeild","yamaha","black",350000,2026);
		b5.show();
		
		Bike b6 = new Bike("royal enfeild","yamaha","black",350000,2026,35.0);
		b6.show();
		
	}

}
