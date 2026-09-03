package com.oops1.inheritance1;

public class Developer extends EmployeeImpl{
	@Override
	public double calculateBonus() {

        return getBasicsalary() * 0.20;
    }

}
