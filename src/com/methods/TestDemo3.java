package com.methods;

public class TestDemo3 {
	
	void fibonacci() {
		int a=0,b=1;
		System.out.println(a + " " + b + " ");
		for(int i=0; i<8; i++) {
			int c=a+b;
			System.out.println(c + " ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		TestDemo3 t1 = new TestDemo3();
		t1.fibonacci();

	}

}
