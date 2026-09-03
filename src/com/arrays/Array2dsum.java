package com.arrays;

import java.util.Scanner;
public class Array2dsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		int sum=0;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j] + " ");
				sum=sum+arr[i][j];
				
			}
			System.out.println();
			
		}
		
		System.out.println("sum : " + sum);
		
	

	}

}
