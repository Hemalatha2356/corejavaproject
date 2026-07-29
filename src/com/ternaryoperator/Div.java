package com.ternaryoperator;

public class Div {

	public static void main(String[] args) {
		int num = 30;
		
		String result = (num%3==0&&num%5==0)? "divisible by both 3 and 5" : "not divisible by both 3 and 5";
		System.out.println(result);

	}

}
