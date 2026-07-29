package com.logicalstatements;
import java.util.Scanner;
public class Grademarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("Enter a marks : ");
		int marks = sc.nextInt();
		if(marks>=90&&marks>=100) {
			System.out.println("grade A " + marks);
			
		}
		else if(marks>=75&&marks>=89){
			System.out.println("grade B " + marks);
		}
		else if(marks>=60&&marks>=74) {
			System.out.println("grade C " + marks);
		}
		else if(marks>=35&&marks>=59) {
			System.out.println("grade D " + marks);
		}
		else {
			System.out.println("failed ");
		}
	

	}

}
