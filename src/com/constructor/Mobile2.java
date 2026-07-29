package com.constructor;

public class Mobile2 {
	String brand;
	String model;
	double price;
	
	Mobile2(String brand,String model,double price){
		System.out.println("parameterized constructor : ");
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	Mobile2(Mobile2 m){
		this.brand=m.brand;
		this.model=m.model;
		this.price=m.price;
	}

	void mobileinfo() {
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("price : " + price);
	}
	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2("oopo","iqz5",98769);
		m1.mobileinfo();
		
		Mobile2 m2 = new Mobile2(m1);
		
		m2.price=m2.price-(m2.price*10/100);
		System.out.println("copied called ");
		m2.mobileinfo();

	}

}
