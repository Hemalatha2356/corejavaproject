package com.arrays;

import java.util.Scanner;

public class Avgerage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a elements");
		int avg=0;
		int sum=0;
		
		int [] arr = {10,20,30,40,50};
		
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		avg=sum/arr.length;
		System.out.println("sum " + sum);
		System.out.println("average : " + avg);
		

	}

}
