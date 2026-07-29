package com.constructor;

public class Product {
	int productid;
	String productname;
	double price;
	String qunatity;
	
	Product(int productid,String productname,double price,String qunatity){
		System.out.println("parameterized constructor called : ");
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.qunatity=qunatity;
		
	}
	
	Product(Product p){
		
		this.productid=p.productid;
		this.productname=p.productname;
		this.price=p.price;
		this.qunatity=p.qunatity;
		
	}
	
	void productinfo() {
		System.out.println("product id : " + productid);
		System.out.println("productname : " + productname);
		System.out.println("price : " + price);
		System.out.println("qunatity : " + qunatity);
	}
	

	public static void main(String[] args) {
		Product p = new Product(101,"pen",98,"good");
		p.productinfo();
		Product p1 = new Product(p);
		System.out.println("reduce the product ");
		p1.price=p1.price-(p1.price*10/100);
		p1.productinfo();

	}

}
