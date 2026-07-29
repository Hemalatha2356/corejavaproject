package com.keywords;
import java.math.BigInteger;
import java.math.BigDecimal;
class dog{
	
	}
class student{
	
}

public class TestDatatypes2 {
	//objective data types
	//pre-defiied data types
	//string is a collection of characters storing into a double quotes. 
	String s="Hema";//String literals
	String str = new String("kjhjjk");
	StringBuffer s1= new StringBuffer("Vcube");// string object --> heap area
	StringBuilder s2=new StringBuilder("Latha");
	BigInteger b1= new BigInteger("7895678976543567876543567856789876");
	BigInteger bi1=new BigInteger("1234567890987654323456787656787656765788");
	
	BigDecimal b2 = new BigDecimal("98765434567890987652345678976543567889765435678976546");
	BigDecimal d1=new BigDecimal("66.77");
	//wrapper object data types
	Integer i1=987657;
	Character c1='A';
	Float f=90.89f;
	Double d=78.9765d;
	
	//user defined data types
	dog g;
	student s4;
	

	public static void main(String[] args) {
		
		TestDatatypes2 t1 = new TestDatatypes2();
		System.out.println("Main method started");

		System.out.println(t1.s);
		System.out.println(t1.str);
		System.out.println(t1.s1);
		System.out.println(t1.s2);
		

		System.out.println(t1.b1.multiply(t1.bi1));
		System.out.println(t1.b1);
		System.out.println(t1.bi1);
		System.out.println(t1.b2);
		System.out.println(t1.i1);
		System.out.println(t1.c1);
		System.out.println(t1.f);
		System.out.println(t1.d);
		System.out.println(t1.g);
		System.out.println(t1.s4);
		

	}

}
