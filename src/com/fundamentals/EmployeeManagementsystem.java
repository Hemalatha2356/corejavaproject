package com.fundamentals;

public class EmployeeManagementsystem {
	static int NextEmployeeid=101;
	
	int Employeeid;
	String EmployeeName;
	long EmployeeSalary;
	
	{
		Employeeid=NextEmployeeid++;
	}
	
	void show() {
		
		System.out.println("Employeeid = " + Employeeid);
		System.out.println("EmployeeName = " + EmployeeName);
		System.out.println("EmployeeSalary = " + EmployeeSalary);
		
		
	}

	public static void main(String[] args) {
		
		EmployeeManagementsystem t1 = new EmployeeManagementsystem();
		t1.EmployeeName="Hema";
		t1.EmployeeSalary=65680;
		t1.show();
		
		EmployeeManagementsystem t2 = new EmployeeManagementsystem();
		t2.EmployeeName="Siva";
		t2.EmployeeSalary=8789768;
		t2.show();
		
		EmployeeManagementsystem t3 = new EmployeeManagementsystem();
		t3.EmployeeName="latha";
		t3.EmployeeSalary=83456;
		t3.show();
	

	}

}
