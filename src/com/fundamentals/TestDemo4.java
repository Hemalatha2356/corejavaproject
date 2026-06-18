package com.fundamentals;

public class TestDemo4 {
	public static void hello() {
		System.out.println("Hello Goog morning");
	}

	public static void main(String[] args) {
		System.out.println("main method stsrted");
		hello();//calling method
		
		//object creation
		TestDemo4 obj=new TestDemo4();
		obj.welcome();// calling the instances
	}
	void welcome() {
		System.out.println("hii");
	}

}
