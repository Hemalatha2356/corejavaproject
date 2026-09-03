package com.arrays;


import java.util.Arrays;


public class Bubblesort {

	public static void main(String[] args) {

		
		int[] arr = {3,5,2,6,9,5};
		int temp=0;
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
	

	}

}
