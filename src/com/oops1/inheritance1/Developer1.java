package com.oops1.inheritance1;

public class Developer1 extends Employee{
	@Override
	void calculateSalary() {
		System.out.println("Developer salary : 50000");
	}
	@Override
	void calculateSalary(double bonus) {
		System.out.println("Enter the Developer bouns  " + (50000 + bonus));
	}

	public static void main(String[] args) {
		
		Developer1 d1 = new Developer1();
		d1.calculateSalary();
		d1.calculateSalary(2000);
		
		

	}

}
