package com.oops1.inheritancetypes;
//single iheritance 
class Animal{
	void animalinfo() {
		System.out.println("animal info");
	}
	void sound() {
		System.out.println("animal calls ha ha!");
	}
	
	
}
//single inherance is one class extends another class is a single inheritance
class Dog extends Animal{
	void Doginfo() {
		System.out.println("dog info");
	}
	void sound() {
		System.out.println("dog calls bow bow!!");
	}
	
	
}//multilevel inheritance is a one class extends another class and another class extends one more class that is called as multilevel inheritance
class babyDog extends Dog{
	void babydoginfoinfo() {
		System.out.println("babydog info");
	}
	void sound() {
		System.out.println("babydog calls buf buf uff!!");
	}
	
	
}


public class TestDemo1 {

	public static void main(String[] args) {
		
		System.out.println("calls dirven method!!");
		
		babyDog bg = new babyDog();
		bg.animalinfo();
		bg.sound();
		bg.babydoginfoinfo();
		bg.Doginfo();
		
		

	}

}
