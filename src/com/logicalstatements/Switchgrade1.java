package com.logicalstatements;

import java.util.Scanner;
public class Switchgrade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entera grades(A,B,C,D,E,F) ");
		char grade = sc.next().charAt(0);
		
		switch(Character.toUpperCase(grade)) {
		case 'A' -> System.out.println("Excellent");
		case 'B' -> System.out.println("very good");
		case 'C' -> System.out.println("good");
		case 'D' -> System.out.println("pass");
		case 'F' -> System.out.println("fail");
		default -> System.out.println("invalid grades");
		
		}

	}

}
