package com.arrays;

import java.util.Scanner;
public class Arrays2dlargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		arr[0][0]=10;
		arr[0][1]=25;
		arr[0][2]=3;
		
		arr[1][0]=45;
		arr[1][1]=12;
		arr[1][2]=8;
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("max = " + max);

	}
		

}
