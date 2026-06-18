package com.fundamentals;

public class TestDemo5 {
	public static void Method1() {
		System.out.println("Method 1 called");
		Method2();
	}
	
	public static void Method2() {
		System.out.println("Method 2 called");
		Method3();
	}
	public static void Method3() {
		System.out.println("Method 3 called");
		Method4();
	}
    public static void Method4() {
		System.out.println("Method 4 called");
		Method5();
    }
	public static void Method5() {
		System.out.println("Method 5 called");
		TestDemo5 obj=new TestDemo5();
		obj.Method6();
		
	}
	public static void main(String[] args) {
		
		Method1();
	}
		
		void Method6() {
			System.out.println("Method 6 called");
			Method7();
		}
		void Method7() {
			System.out.println("Method 7 called");
			Method10();
			
		}
		void Method8() {
			System.out.println("Method 8 called");
			Method9();
		}
		void Method9() {
			System.out.println("Method 9 called");
			Method8();
		}
		void Method10() {
			System.out.println("Method 10 called");

	}

}
