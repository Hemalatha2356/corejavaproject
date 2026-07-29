package com.constructor;


public class College {
	String clgName;
	String city;
	int numberofstudents;
	
	College(){
		this("kits");
		System.out.println("no - arg constructor called : ");
	}
	College(String clgName){
		this(clgName,"nrt");
		System.out.println("one - arg constructor called : ");
	}
	College(String clgName,String city){
		this(clgName, city, 35);
		System.out.println("two-ard constructor called : ");
	}
	College(String clgName,String city,int numberofstudents){
		
		this.clgName=clgName;
		this.city=city;
		this.numberofstudents= (int)numberofstudents;
		
		System.out.println("three arg constructor called : ");
	}
	
	void display() {
		System.out.println("****************************************");
		System.out.println("Enetr a clgName : " + clgName);
		System.out.println("Enetr a city : " + city);
		System.out.println("Enetr a numberofstudents : " + numberofstudents);
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started : ");
		College c = new College();
		c.display();
		College c1 = new College("khit");
		c1.display();
		College c2 = new College("khit","Guntur");
		c2.display();
		College c3 = new College("khit","Guntur",34);
		c3.display();
		System.out.println("main method ended ");
	
		

	}

}
