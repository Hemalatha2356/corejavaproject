package com.ternaryoperator;

public class Max {

	public static void main(String[] args) {
		int a=8;
		int b=9;
		int c=4;
		
		int result = (a>b) ?((a>c)?a:c) : ((b>c)?b:c);
		System.out.println(result);

	}

}
