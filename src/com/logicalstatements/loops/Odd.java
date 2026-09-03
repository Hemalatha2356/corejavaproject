package com.logicalstatements.loops;
//wap to find the nth odd number?
import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
	int n = sc.nextInt();
	int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
			
				count++;
				if(count==n) {
					System.out.println("odd " + i);
					break;
				}
				
			}
		}
	}
}
