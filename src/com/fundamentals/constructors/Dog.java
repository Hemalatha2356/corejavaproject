package com.fundamentals.constructors;

class Dog extends Mammal {
	
	Dog(){
		this("cat");
		System.out.println("default constructor called");
	}
	Dog(String name){
		System.out.println("dog parameterized consatuctor called " + name);
	}

	

}
