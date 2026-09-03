package com.oops2;

public class Person {
	
	String name;
	Address1 address;
	
	Person(String name,Address1 address){
		this.name=name;
		this.address=address;
	}
	//deep copy constructor
	Person(Person p){
		this.name=p.name;
		
		//deep copy line
		this.address=new Address1(p.address.city);
	}

	public static void main(String[] args) {
		Address1 a = new Address1("Guntur");
		
		
		Person p1 = new Person("Hema",a);
		
		Person p2 = new Person(p1);
		
		p1.address.city="narasaraoper";
		
		System.out.println(p1.address.city);
		System.out.println(p2.address.city);
		
		

	}

}
