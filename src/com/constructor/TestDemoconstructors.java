package com.constructor;

class vehicle {
	String brand="honda";
	String model="royalfieds";
	double price=100000;
	
}

class car1 extends vehicle{
	String brand="jawa";
	String model="sd";
	double price=200000;
	
	
	void show() {
		System.out.println("*********show method called  ***************");
		System.out.println("brand of car : " + super.brand);
		System.out.println("model of car : " + super.model);
		System.out.println("price of car : " + super.price);

	}
	void carinfo() {
		System.out.println("********show method called *********");
		System.out.println("brand of car : " + this.brand);
		System.out.println("model of car : " + this.model);
		System.out.println("price of car : " + this.price);

	
}
}
//driver classes
public class TestDemoconstructors {

	public static void main(String[] args) {
	System.out.println("main method started : ");
	
	car1 c = new car1();
	c.show();
	c.carinfo();

	}

}
