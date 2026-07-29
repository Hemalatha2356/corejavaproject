package com.keywords;

public class Pens {

	public static void main(String[] args) {
		
		int money=300;
		int cost=15;
		int purchasedpens=money/cost;
		int free=purchasedpens/5;
		int total=purchasedpens+free;
		System.out.println("purchasedpens " + purchasedpens);
		System.out.println("free " + free);
		System.out.println("total " + total);
		
	}

}
