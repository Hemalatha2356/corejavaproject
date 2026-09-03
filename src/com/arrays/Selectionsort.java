package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {8,3,7,9,3,5,6};
		
		System.out.println("Before sorting :");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			int temp = arr[i];
	        arr[i] = arr[minindex];
	        arr[minindex] = temp;
		}
		
		System.out.println("After sorting :");
		System.out.println(Arrays.toString(arr));
		

	}

}
