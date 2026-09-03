package com.pattens;

public class Starpatten4 {

	public static void main(String[] args) {
		
		for(int i = 1;i <= 6; i++) {
			//print spaces
			for(int j = 6;j > i; j--) {
				System.out.print(" ");
			}
			//print stars
			for(int k = 1;k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
