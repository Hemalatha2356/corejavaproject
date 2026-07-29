package com.logicalstatements;

import java.util.Scanner;
public class Characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
	    char ch = sc.next().charAt(0);
	    if(ch>='A' && ch<='Z') {
	    	System.out.println("upper cases : ");
	    	
	    }
	    else if (ch >='a' && ch<'z') {
	    	System.out.println("lower cases : ");
	    }
	    else {
	    	System.out.println("not alphabet");
	    }

	}

}
