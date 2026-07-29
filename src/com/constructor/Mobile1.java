package com.constructor;

public class Mobile1 {
	String brand;
	String model;
    int ram;
	int storage;
	double price;
	Mobile1(){
		System.out.println("default constructor called : ");
	}
	
	Mobile1(String brand,String model,int ram,int storage,double price){
		System.out.println("parameterized constructor called : ");
		this.brand=brand;
		this.model=model;
		this.ram=ram;
		this.storage=storage;
		this.price=price;
	}
	//copy consrtuctor 
	Mobile1(Mobile1 m){
		System.out.println("copyed constructor called : ");
		this.brand=m.brand;
		this.model=m.model;
		this.ram=m.ram;
		this.storage=m.storage;
		this.price=m.price;
		
	}
	
	void mobileinfo() {
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("ram : " + ram);
		System.out.println("storage : " + storage);
		System.out.println("price : " + price);
	}

	public static void main(String[] args) {
		Mobile1 m = new Mobile1("oopo","iphone",64,256,89000000);
		m.mobileinfo();
		Mobile1 m1 = new Mobile1(m);
		System.out.println("updated storage");
		m1.storage=64;
		System.out.println("updated ram");
		m1.ram=16;
		m1.mobileinfo();

	}

}
