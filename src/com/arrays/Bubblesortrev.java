package com.arrays;

import java.util.Arrays;

public class Bubblesortrev {

	public static void main(String[] args) {
		int [] arr = {5,4,3,2,1};
		System.out.println("before swaping ");
		System.out.println(Arrays.toString(arr));
		int swap=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
				}
			}
		}
		
		System.out.println("before swaping ");
		System.out.println(Arrays.toString(arr));
		System.out.println("swap : " + swap);
	}

}
