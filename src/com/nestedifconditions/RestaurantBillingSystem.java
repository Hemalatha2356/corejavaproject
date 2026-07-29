package com.nestedifconditions;

import java.util.Scanner;
public class RestaurantBillingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a catageroy : ");
		String catg = sc.next();
		String yn1 = " ";
		int vegtotal=0;
		int nonvegtotal=0;
		int Drinktotal=0;
		
		switch(catg) {
		
		case "vegitem" ->{
			do {
				System.out.println("Enter a item : ");
				String item = sc.next();
				System.out.println("Enter a price : ");
				int price = sc.nextInt();
				switch(item) {
				case "ldli" -> System.out.println("ldil price : " + price);
				case "Dosa" -> System.out.println("Dosa price : " + price);
				case "puri" -> System.out.println("puri price : " + price);
				case "meals" -> System.out.println("meals price : " + price);
				case "friedrice" -> System.out.println("fried rice price : " + price);
				default -> System.out.println("the item is invalid!!");
				}
				vegtotal = vegtotal+price;
				System.out.println("do you want to continue the item : click y yes/ n for no");
				yn1 = sc.next();
				
			}while(yn1.equalsIgnoreCase("y"));
			System.out.println("---------------------------------");
			System.out.println("vegitem" + vegtotal +"RS");
			System.out.println("---------------------------------");
			
		}
		
		case "nonveg" -> {
			do {
				System.out.println("Enter a non-veg item : ");
				String item = sc.next();
				System.out.println("Enter a price : ");
				int nonvegprice = sc.nextInt();
				switch(item) {
				case "chickenbriyani" -> System.out.println("chickenbriyani price : " + nonvegprice );
				case "muttonbriyani" -> System.out.println("briyani price : " + nonvegprice );
				case "chickencurry" -> System.out.println("chickencurry price : " + nonvegprice );
				case "fishfry" -> System.out.println("fishfry price : " + nonvegprice );
				default -> System.out.println("the item is invalid");
				}
				nonvegtotal = nonvegtotal+nonvegprice;
			
				System.out.println("do you want to continue the item : click y yes/ n for no");
				yn1 = sc.next();
				
			}while(yn1.equalsIgnoreCase("y"));
			System.out.println("------------------------------");
			System.out.println("nonveg item" + nonvegtotal +"RS");
			System.out.println("------------------------------");
			
		}
		
		case "drinks" -> {
			do {
				System.out.println("Enter a Drinks : ");
				String Drinks = sc.next();
				System.out.println("Enter a price : ");
				int Drinkprice = sc.nextInt();
				switch(Drinks) {
				case "tea" -> System.out.println("tea price : " + Drinkprice);
				case "coffe" -> System.out.println("coffe price : " + Drinkprice);
				case "juice" -> System.out.println("juice price : " + Drinkprice);
				case "cooldrink" -> System.out.println("cool drink price : " + Drinkprice);
				default -> System.out.println("the item is invalid!!");
				}
				Drinktotal = Drinktotal+Drinkprice;
				System.out.println("do you want to continue the item : click y yes/ n for no");
				yn1 = sc.next();
			}while(yn1.equalsIgnoreCase("y"));
			System.out.println("------------------------------");
			System.out.println("Drinks Total" + Drinktotal +"RS");
			System.out.println("------------------------------");
			
		}
		
		default-> System.out.println("the entered catagerory is not avaliable!!");
			
		}
		int grandtotal = vegtotal+nonvegtotal+Drinktotal;
		System.out.println("=========================================");
		System.out.println("veg total : " + vegtotal +"RS");
		System.out.println("nonveg total : " + nonvegtotal +"RS");
		System.out.println("Drinks total : " + Drinktotal +"RS");
		System.out.println("--------------------------------------");
		System.out.println("grand total : " + grandtotal + "RS");
		System.out.println("========================================");
		
		
		
		}
		

}


