package com.constructor;

public class Laptop {
	
	String brand;
	int ram;
	double price;
	Laptop(String brand,int ram,double price){
		
		System.out.println("parameterized constructor : ");
		this.brand=brand;
		this.ram=ram;
		this.price=price;	
	}
	
	Laptop(Laptop l){
		System.out.println("copy consrtuctor called : ");
		this.brand=l.brand;
		this.ram=l.ram;
		this.price=l.price;	
		
	}
	
	void info() {
		
		System.out.println("brand : " + brand);
		System.out.println("ram : " + ram);
		System.out.println("pricee : " + price);
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		
		Laptop l = new Laptop("lenovo",64,900000);
		l.info();
		Laptop l1 = new Laptop(l);
		l1.price=l1.price+10000;
		l1.info();

	}

}
