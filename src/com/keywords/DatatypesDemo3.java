package com.keywords;

public class DatatypesDemo3 {
	//instance block
	Integer Empno=101;
	String Ename="hemalatha";
	Double Salary=5000.0;
	
	
	Integer Experience=2;
	String hiredate="03-07-2026";
	Double annual_sal=Salary*12;
	Double annual_bonus=annual_sal/10;
	Double total_sal=annual_bonus+annual_sal;
	
	{
		System.out.println(Empno);
		System.out.println(Ename);
		System.out.println(Salary);
		System.out.println(Experience);
		System.out.println(hiredate);
		System.out.println(annual_sal);
		System.out.println(annual_bonus);
		System.out.println(total_sal);
	}

	public static void main(String[] args) {
		 DatatypesDemo3 d=new  DatatypesDemo3();
		
		
		

	}

}
