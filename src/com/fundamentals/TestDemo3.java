package com.fundamentals;

public class TestDemo3 {
	static TestDemo3 obj = new TestDemo3();
	

	static void Method1() {
		System.out.println("Method1 called");
		
		obj.Method2();
	}

	void Method2() {
		System.out.println("Method2 called");
		Method3();

	}

	static void Method3() {
		System.out.println("Method3 called");
		obj.Method4();
	}

	void Method4() {
		System.out.println("Method4 called");
	}
	
	public static void main(String[] args) {

		System.out.println("main method stsrted");
		Method1();

	}
}
