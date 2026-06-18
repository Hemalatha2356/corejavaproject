package com.fundamentals;

public class TestDemo2 {
	
	//static variable
	 public static void Method1(){
		System.out.println("Method1");
		Method2(); 
	}
	 public static void Method2() {
		 System.out.println("Method2");
		 Method3(); 
	 }
	 public static void Method3() {
		 System.out.println("Method3");
		 TestDemo2 obj = new TestDemo2();
		 obj.Method4();
	 }
	 static {
		 Method1();
	 }
	public static void main(String[] args) {
		
	}
	void Method4() {
		System.out.println("Method4");
		Method5();
	}
	void Method5() {
		System.out.println("Method5");
		Method6();
	}
	void Method6() {
		System.out.println("Method6");
	}

}
