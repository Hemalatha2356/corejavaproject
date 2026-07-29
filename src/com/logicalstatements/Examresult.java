package com.logicalstatements;
import java.util.Scanner;
public class Examresult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Exam result : ");
		
		int marks = sc.nextInt();
		if(marks>=90) {
			
			System.out.println("outstanding : ");
		}
		else if(marks>=75) {
			System.out.println("Exllent");
		}
		else if(marks>=50) {
			System.out.println("good : ");
		}
		else if(marks>=35) {
			System.out.println("pass :  ");
		}
		else {
			System.out.println("failed ");
		}

	}

}
