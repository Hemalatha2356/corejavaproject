package com.nestedifconditions;

import java.util.Scanner;
public class Switchvegorfru {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a catagetory (veg/fru): ");
		String catg = sc.next();
		String yn1= " ";
		int vegtotal = 0;
		int frutotal=0;
		
		
		switch(catg) {
		case "veg" -> {
			do {
				
				System.out.println("Enter a item : ");
				String item = sc.next();
				System.out.println("Enter a price : ");
				int price = sc.nextInt();

				
				
				switch(item) {
				case "tmt" -> System.out.println("Tomato - Price : " + price);
				case "ptt" -> System.out.println("Potato - Price : " + price);
				case "onn" -> System.out.println("Onion - Price : " + price);
				case "crt" -> System.out.println("Carrot - Price : " + price);
				case "bng" -> System.out.println("Brinjal - Price : " + price);
				case "cbb" -> System.out.println("Cabbage - Price : " + price);
				case "clf" -> System.out.println("Cauliflower - Price : " + price);
				case "bns" -> System.out.println("Beans - Price : " + price);
				case "ckm" -> System.out.println("Cucumber - Price : " + price);
				case "chl" -> System.out.println("Chilli - Price : " + price);
				default -> System.out.println("items are not avaliable : ");
		
				}
				vegtotal += price;
				
				System.out.println("do you want to continue the item : click y yes/ n for no");
				
				yn1 = sc.next();
			}while(yn1.equalsIgnoreCase("y"));
			 System.out.println("---------------------------");
			    System.out.println("Vegetable Total = " + vegtotal + " RS");
			    System.out.println("---------------------------");
		}
		
		case "fru" -> {
			do {
				System.out.println("Enter a fruit : ");
				String fruit = sc.next();
				System.out.println("Enter the fruit price : ");
				int price = sc.nextInt();
				
				switch(fruit) {
				case "app" -> System.out.println("Apple - Price : " + price);
				case "ban" -> System.out.println("Banana - Price : " + price);
				case "org" -> System.out.println("Orange - Price : " + price);
				case "mng" -> System.out.println("Mango - Price : " + price);
				case "grp" -> System.out.println("Grapes - Price : " + price);
				case "png" -> System.out.println("Pomegranate - Price : " + price);
				case "pap" -> System.out.println("Papaya - Price :  " + price);
				case "gva" -> System.out.println("Guava - Price :  " + price);
				case "wml" -> System.out.println("Watermelon - Price :  " + price);
				case "pin" -> System.out.println("Pineapple - Price :  " + price);
				default -> System.out.println("fruits are not avaliable!!");
				}
				frutotal+=price;
				System.out.println("do you want to contioune the items : click y yes/ n for no");
				yn1 = sc.next();
			}while(yn1.equalsIgnoreCase("y"));
			System.out.println("------------------------------------");
			System.out.println("fruits total =  " + frutotal+ "RS");
			System.out.println("------------------------------------");
			
		}
		default-> System.out.println("the entered catagerory is not avaliable!!");
		}
		
		int grandTotal = vegtotal + frutotal;

		System.out.println("==========================");
		System.out.println("Vegetable Total : " + vegtotal + " RS");
		System.out.println("Fruit Total     : " + frutotal + " RS");
		System.out.println("--------------------------");
		System.out.println("Grand Total     : " + grandTotal + " RS");
		System.out.println("==========================");
		

	}

}
