package com.fundamentals;

public class cricketer {
	//Declaration
	// int is represent the numbers
	//String is represent the collection of characters
	//instalization
	//static variable
	static int countryid=68;
	static String countryname="india";
	
	//instances variable
	
	int jerseyno;
	String cricketername;
	

	public static void main(String[] args) {
		System.out.println("welcome to cricket team ");
		
		System.out.println(countryid);
		System.out.println(countryname);
		
		
		//object creation in instance variable
		//ms1 is the reference variable name
		//new is the keyword to create an object with the help of constructor calling
		//Cricketer() constructor calling
		//rhs will consider as object
		cricketer ms1=new cricketer();
		ms1.jerseyno=77;
		ms1.cricketername="virat";
		System.out.println(ms1.jerseyno);
		System.out.println(ms1.cricketername);
		
		
		
		

	}

}
