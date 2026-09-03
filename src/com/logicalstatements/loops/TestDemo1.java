package com.logicalstatements.loops;
import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int temp=n;
		int sum=0;
		int count=0;
		int r=0;
	
		while (n > 0) {
			r = n % 10; 
			sum=sum+r;// 
		    n = n / 10; 
			  
		    count++;         
		}
		System.out.println("no of digits count : " + count);
		System.out.println("sum of digits : " + sum);

	}

}
