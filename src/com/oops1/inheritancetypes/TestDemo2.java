package com.oops1.inheritancetypes;

class Employee{
	
	void calculateSalary() {
		System.out.println("employee salary : 2000");
	}
}
class Developer extends Employee{
	@Override
	void calculateSalary() {
		System.out.println("developer salary : 5000");
	}
	
}

class Tester extends Employee{
	@Override
	void calculateSalary() {
		System.out.println("tester salary : 8000");
	}
}

class Manager extends Employee{
	@Override
	void calculateSalary() {
		System.out.println("Manager salary : 10000");
	}
}

public class TestDemo2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Developer();
		Employee e2 = new Tester();
		Employee e3 = new Manager();
		e.calculateSalary();
		e1.calculateSalary();
		e2.calculateSalary();
		e3.calculateSalary();

	}

}
