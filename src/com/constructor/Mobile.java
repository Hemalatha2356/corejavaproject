package com.constructor;

public class Mobile {
	String brand;
	String model;
	int ram;
	int storage;
	double price;
	String color;
	String processor;
	
	Mobile(){
		this("Apple");
		System.out.println("no arg constructor called  ");
	}
	
	
	Mobile(String brand){
		this("brand","iphone12");
		System.out.println("one arg constructor called : ");
		
	}
	
	Mobile(String brand,String model){
		this("brand","model",16);
		
		System.out.println("two arg constructor called : ");
	}
	Mobile(String brand,String model,int ram){
		this("brand","model",16,256);
		System.out.println("three arg constructor called : ");
	}
	
	Mobile(String brand,String model,int ram,int storage){
		
		this("brand","model",16,256,567890);
		System.out.println("four arg constructor called : ");
	}
	
	Mobile(String brand,String model,int ram,int storage,double price){
		this("brand","model",16,256,567890,"green");
		System.out.println("five arg constructor called : ");
	}
	Mobile(String brand,String model,int ram,int storage,double price ,String color){
		this("brand","model",16,256,567890,"green","elite");
		System.out.println("six arg constructor called : ");
	}
	Mobile(String brand,String model,int ram,int storage,double price,String color,String processor){
		
		this.brand=brand;
		this.model=model;
		this.ram=ram;
		this.storage=storage;
		this.price=price;
		this.color=color;
		this.processor=processor;
		System.out.println("seven arg constructor called : ");
	}
	
	void mobileinfo() {
		System.out.println("******************************************");
		System.out.println("mobile brand : " + brand);
		System.out.println("mobile model : " + model);
		System.out.println("mobile ram : " + ram);
		System.out.println("mobile storage : " + storage);
		System.out.println("mobile price : " + price);
		System.out.println("mobile color : " + color);
		System.out.println("mobile processor : " + processor);
		System.out.println("************************************************");
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started : ");
		
		Mobile m = new Mobile();
		m.mobileinfo();
		Mobile m1 = new Mobile("Apple");
		m1.mobileinfo();
		Mobile m2 = new Mobile("Apple","iphone");
		m2.mobileinfo();
		Mobile m3 = new Mobile("Apple","iphone",16);
		m3.mobileinfo();
		Mobile m4 = new Mobile("Apple","iphone",16,256);
		m4.mobileinfo();
		Mobile m5 = new Mobile("Apple","iphone",16,256,567890);
		m5.mobileinfo();
		Mobile m6 = new Mobile("Apple","iphone",16,256,567890,"green");
		m6.mobileinfo();
		Mobile m7 = new Mobile("Apple","iphone",16,256,567890,"green","elite");
		m7.mobileinfo();
		
		System.out.println("main method ended : ");
	

	}

}
