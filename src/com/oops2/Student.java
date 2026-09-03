package com.oops2;

public class Student {
	
	String name;
	Address address;
	
	Student(String name,Address address){
		this.name=name;
		this.address=address;
	}

	//copy constructor
	
	Student(Student s){
		this.name=s.name;
		this.address=new Address(s.address.city);
	}

	public static void main(String[] args) {
		Address a = new Address("Guntur");
		Student s1 = new Student("hema",a);
		Student s2 = new Student(s1);
		
		s1.address.city="Hyderabad";
		
		System.out.println("original " + s1.address.city);
		System.out.println("copied " + s2.address.city);
		

	}

}
