package com.oops1.inheritance1;

public class Manager extends EmployeeImpl{
	@Override
	public double calculateBonus() {

        return getBasicsalary() * 0.30;
    }


	public static void main(String[] args) {
		System.out.println("main method started");
		EmployeeImpl e1 = new Manager();
		
		e1.setEmployeeid(101);
		e1.setBasicsalary(50000);
		e1.setExperience(2);
		e1.setName("Hema");
		System.out.println(e1.calculateBonus());
		System.out.println(e1.calculatesalary());
		
		System.out.println(e1.getBasicsalary());
		System.out.println(e1.getEmployeeid());
		System.out.println(e1.getExperience());
		System.out.println(e1.getName());

	}

}
