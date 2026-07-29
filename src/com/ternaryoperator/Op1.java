package com.ternaryoperator;

public class Op1 {

	public static void main(String[] args) {
		int a=34;
		int b=4;
		
		String result = (a<b)? (a + "is smallerthan : ") :(b<a) ?(b + "is smaller than"):"both are equal" ;
		System.out.println(result);

	}

}
