package com.logicalstatements;
import java.util.Scanner;
public class Divisibleby5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%5==0) {
			System.out.println("the number is divisible by 5 : ");
			
		}
		else {
			System.out.println("the number is not divisible by 5");
		}
		sc.close();

	}

}
