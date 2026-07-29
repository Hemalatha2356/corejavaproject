package com.ternaryoperator;

public class Uppercase {

	public static void main(String[] args) {
		char ch = 'a';
		String result = (ch >='A' && ch<='Z') ? "uppercase" : "Lowercase"; 
        System.out.println(result);
	}

}
