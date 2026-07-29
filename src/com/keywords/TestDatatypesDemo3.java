package com.keywords;

public class TestDatatypesDemo3 {
	Integer eno=10;
	String ename="Hema";
	Double sal=56788.0;
	String hiredate="06-08-04";
	Integer Experience=2;
	
	Double annual_sal =sal*12;
	Double annual_bouns=annual_sal/10;
	Double totalsal = annual_sal + annual_bouns;
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(hiredate);
		System.out.println(Experience);
		System.out.println(annual_sal );
		System.out.println(annual_bouns);
		System.out.println(totalsal);
	}
	
	public static void main(String[] args) {
		
		TestDatatypesDemo3 t = new TestDatatypesDemo3();

	}

}
