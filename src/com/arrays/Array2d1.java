package com.arrays;

import java.util.Scanner;

public class Array2d1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a elements");
		int[][] arr = new int[3][4];
		//rows nii count chesthudii
		System.out.println(arr.length);
		//Row 0 lo enni columns unnayo cheptundi.
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
	
		arr[0][0]=89;
		arr[0][1]=89;
		arr[0][2]=89;
		arr[0][3]=89;
		
		arr[1][0]=54;
		arr[1][1]=54;
		arr[1][2]=54;
		arr[1][3]=54;
		
		arr[2][0]=34;
		arr[2][1]=34;
		arr[2][2]=34;
		arr[2][3]=34;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		

	}

}
