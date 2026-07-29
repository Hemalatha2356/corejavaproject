package com.keywords;

public class Biscuit {


	public static void main(String[] args) {
		
		int money=300;
		int cost=15;
		int purchasedpackets=money/cost;
		int free=purchasedpackets/4;
		int total=purchasedpackets+free;
		
		System.out.println("purchasedpackets " +  purchasedpackets);
		
		System.out.println("free " + free);

		System.out.println("total " + total);
	}

}
