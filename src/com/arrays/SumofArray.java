package com.arrays;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a elements : ");
		int []arr= new int[5];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		
			
		}
		System.out.println("sum of digits are  : " + sum);

	}

}
