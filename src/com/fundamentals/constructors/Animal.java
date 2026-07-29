package com.fundamentals.constructors;

public class Animal {
	Animal(){
		this("unknow");
		System.out.println("default constructor called : ");
	}
	
	
	Animal(String name){
		
		System.out.println("Animal parameterized constructor called : " + name);
		
	}

}
