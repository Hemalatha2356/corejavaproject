package com.arrays;

import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started!");
		System.out.println("enter elements : ");
		int [][] arr = new int[3][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
	
		arr[1][0]=32;
		arr[1][1]=78;
		arr[1][2]=34;
		
		arr[2][0]=45;
		arr[2][1]=89;
		arr[2][2]=32;
		System.out.println("2d array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
