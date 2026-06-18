package com.fundamentals;

public class TestDemo6 {
	static TestDemo6 obj=new TestDemo6();


	public static void main(String[] args) {
		
		System.out.println("Method started");
		
		Method1();
		
	}
		static void Method1() {
			System.out.println("Method1");
			obj.Method2();
		}
		void Method2() {
			System.out.println("Method2");
			Method3();
		}
		static void Method3() {
			System.out.println("Method3");
			obj.Method4();
		}
		
		void Method4() {
			System.out.println("Method4");
			Method5();
		}
		
		static void Method5() {
			System.out.println("Method5");
			obj.Method6();
		}
		void Method6() {
			System.out.println("Method6");
			Method7();
		}
		static void Method7() {
			System.out.println("Method7");
			obj.Method8();
		}
		void Method8() {
			System.out.println("Method8");
			Method9();
		}
		static void Method9() {
			System.out.println("Method9");
			obj.Method10();
		}
		void Method10() {
			System.out.println("Method10");
		}
}
