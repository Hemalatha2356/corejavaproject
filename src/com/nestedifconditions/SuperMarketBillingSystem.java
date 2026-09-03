package com.nestedifconditions;

import java.util.Scanner;
public class SuperMarketBillingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a catartory : ");
		String catg = sc.next();
		
		switch(catg) {
		case "vegetables" -> {
			System.out.println("Enter a item : ");
			String item = sc.next();
			switch(item) {
			case "tmt" -> System.out.println("tomato ");
			case "crt" -> System.out.println("carrot");
			case "ptt" -> System.out.println("potato");
			case "oni" -> System.out.println("onion");
			default -> System.out.println("the item is invalid");
			}
		}
		
		}
		

	}

}
