package com.oops1.inheritance1;

public class EmployeeImpl{
	
//	Employee ID
//	Name
//	Basic salary
//	Experience
	
	private int Employeeid;
	private String name;
	private double basicsalary;
	private int experience;
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.Employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

	public double calculateBonus() {
		
		if(experience<2) {
			return basicsalary*2.0;
		}else if(experience<=5) {
			return basicsalary*10.0;
		}else {
			return basicsalary*15.0;
		}
	    
	}
	public double calculatesalary() {
		return basicsalary+calculateBonus();
	}
	
	
	

}
