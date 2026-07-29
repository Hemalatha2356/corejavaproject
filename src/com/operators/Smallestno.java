package com.operators;

public class Smallestno {

	public static void main(String[] args) {
		int a=10;
		int b=34;
		int c=12;
		int smallest = (a<b) ? ((a<c)?a:c) : ((b<c)? b:c);
		System.out.println("the smallest number is : "+ smallest);
		

	}

}
