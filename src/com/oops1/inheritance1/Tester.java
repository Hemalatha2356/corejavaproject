package com.oops1.inheritance1;

public class Tester extends EmployeeImpl{
	@Override
	public double calculateBonus() {

        return getBasicsalary() * 0.10;
    }

}
