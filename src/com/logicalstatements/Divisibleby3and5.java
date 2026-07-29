package com.logicalstatements;
import java.util.Scanner;
public class Divisibleby3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(num%3==0) {
			System.out.println("divisible by 3 : ");
		}
		else if(num%5==0) {
			System.out.println("divisible by 5 : ");
		}
		else {
			System.out.println("not divisible by both : ");
		}
		sc.close();

	}

}
