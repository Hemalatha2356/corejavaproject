package com.arrays;
//wap [1, 3, 4, 2, 2] duplicate element is removed
import java.util.Scanner;
public class Duplicateelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		System.out.println("Enter a elements: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					System.out.println("duplicate elements are : " + arr[i]);
				}
			}
			
		}

	}

}
