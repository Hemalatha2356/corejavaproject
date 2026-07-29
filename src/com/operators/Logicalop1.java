package com.operators;
// && || !
public class Logicalop1 {

	public static void main(String[] args) {
		System.out.println("***********Logical and*************");
		
		int a=8;
		int b=5;
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println("______________________________");
		System.out.println(a>b&&b<a);
		System.out.println(a>b&&b>a);
		System.out.println(b>a&a>b);
		System.out.println(b>a&&b<a);
		
		System.out.println("********logical or*********");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println("________________________________");
		System.out.println(a>b||b<a);
		System.out.println(a>b||b>a);
		System.out.println(b>a||a>b);
		System.out.println(b>a||b>a);
		System.out.println("**************************************");
		System.out.println(!(b>a));
		

	}

}
