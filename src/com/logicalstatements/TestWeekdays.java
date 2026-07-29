package com.logicalstatements;
import java.util.Scanner;
public class TestWeekdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a days : ");
		int days = sc.nextInt();
		switch(days) {
		case 1 :
		System.out.println("monday");
		System.out.println("lazy day");
		break;
		case 2 :
			System.out.println("tuesday");
			break;
		case 3 :
			System.out.println("wensday");
			break;
		case 4 :
			System.out.println("thursday");
			break;
		case 5 :
			System.out.println("friday");
			break;
		case 6 :
			System.out.println("saturday");
			break;
		case 7 :
			System.out.println("sunday");
			break;
		
		default : 
			System.out.println("invalid dayy");
		}
	

	}

}
