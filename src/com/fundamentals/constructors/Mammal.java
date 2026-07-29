package com.fundamentals.constructors;


class Mammal extends Animal{
	Mammal(){
		this("cow");
		System.out.println("default constructor called : ");
	}
	
	Mammal(String name){
		super("Animal");
		System.out.println("mammal parameterized constructor called " + name);
	}
	
}