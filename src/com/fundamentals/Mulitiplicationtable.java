package com.fundamentals;

public class Mulitiplicationtable {
	void mulitiplicationtable(int num) {
		System.out.println("mulitiplication table "+ num);
		for(int i=1;i<=10;i++) {
			System.out.println(num + "x" + 1 + "="+(num*i) );
			
		}
	}

	public static void main(String[] args) {
		Mulitiplicationtable t1 = new Mulitiplicationtable();
		t1.mulitiplicationtable(10);


	}

}
