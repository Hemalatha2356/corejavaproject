package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Addarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] a1 = {1,2,3};
		int[] a2 = {4,5,6};
		int[] a3 = new int[a1.length+a2.length];
		
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[a1.length+i]=a2[i];
		}
		
		System.out.println(Arrays.toString(a3));

	}

}
