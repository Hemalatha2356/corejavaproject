package com.fundamentals;

public class Movie {
	//Declaration
	//instilastion
	//static variables
	static int Movieid=234;
	static String MovieName="Pushpa";
	
	//instances variable
	
	int MovieId;
	String industryName;
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Hello Good morning");
		System.out.println("IndustryName");
		Movie mv1=new Movie();
		
		System.out.println(Movieid);
		System.out.println(mv1.MovieName);
		System.out.println(mv1.industryName);
		
		
	}

}
