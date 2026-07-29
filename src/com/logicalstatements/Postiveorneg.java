package com.logicalstatements;
import java.util.Scanner;
public class Postiveorneg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("postive number  ");
			
		}
		else if(num<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();
		

	}

}
