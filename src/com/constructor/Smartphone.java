package com.constructor;

public class Smartphone {
	int productid;
	String productname;
	String brand;
	double price;
	int warranty;
	
	Smartphone(int productid, String productname,String brand,double price,int warranty) {
		System.out.println("paramerized constructor called : ");
		this.productid=productid;
		this.productname=productname;
		this.brand=brand;
		this.price=price;
		this.warranty=warranty;
	}
	
	Smartphone(Smartphone s){
		System.out.println("copy constructor called : ");
		this.productid=s.productid;
		this.productname=s.productname;
		this.brand=s.brand;
		this.price=s.price;
		this.warranty=s.warranty;
		
	}
	
	void info() {
		System.out.println("product id : " + productid);
		System.out.println("product name : " + productname);
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("warranty : " + warranty);	
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Smartphone s = new Smartphone(100,"oil","sunflower",90876,89);
		System.out.println("original product : ");
		s.info();
		Smartphone s1 = new Smartphone(s);
		
		s1.productid=102;
		System.out.println("copy product: ");
		s1.info();
		
	}

}
