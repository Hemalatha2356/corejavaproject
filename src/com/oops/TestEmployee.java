package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("employee info..");
		
		Employee emp1 = new Employee();
		
		emp1.setEid(101);
		emp1.setEname("hema");
		emp1.setsalary(1800);
		
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getsalary());
	}
}
