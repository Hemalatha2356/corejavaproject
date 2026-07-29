package com.methods;
import java.util.Scanner;
public class Squarenumber {
	static Scanner sc = new Scanner(System.in);

	    int squarenumber(int s){
	   
	    	int squarenumber = sc.nextInt();
		int squarenumber1 = s*s;
		return squarenumber1;
		
	}

	public static void main(String[] args) {
		 Squarenumber s = new  Squarenumber();
		 
		 System.out.println("enter a number : ");
		 
		 int result = s.squarenumber(10);
		 
		 System.out.println("square number : " + result);
		
	}
		

	

}
