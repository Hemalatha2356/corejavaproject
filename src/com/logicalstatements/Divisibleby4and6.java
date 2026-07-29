package com.logicalstatements;

public class Divisibleby4and6 {

	public static void main(String[] args) {
		int num=63;
		if(num%4==0) {
			System.out.println("4 is divisible by : " + num);
		}
		else if(num%6==0) {
			System.out.println("6 is divisible by : " + num);
		}
		else {
			System.out.println("not divisible by both");
		}
   
	}

}
