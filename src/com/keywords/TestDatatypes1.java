package com.keywords;

public class TestDatatypes1 {
	//primitive data types
	//type casting : it converting the one datatype to another datatype  value it will consider as it is type casting. 
	//explicit type casting: it convert into the big data type it store the smaller data type values.
	//implicit type casting : it convert into the smaller data type it stores the big data type values.
	//byte range is -128 t0 127;
	byte b = (byte) 128;//explicit
	 byte b2=127;
	byte b3=(byte) 4568;
	byte b4 = -98;
	// short range is -32,768 to 32,767
	short s=6789;//implicit type casting
	short s1 = (short) 45678; // explicit type casting
	//int range is -2147483648 to 2147483647;
	int i=2147483647;// implicit 
	int i1 = -2147483648;
	int i2 = (int) 2147483647L;//ecplict type casting
	int i3 = 100;
	//long range is 9972677655L
	long l1= -9223372036854775808L;
	long l2= 9223372036854775807L;
	long l3 = 5678L;
	
	float f1=56789F;
	float f2=100F;
	float f = 912854397L;
	float f3=567.5678F;
	
	double a1=34.4356789076545678986767767876543256;
	double d = 45678.87654;
	double d1= 43.3456;
	double d2= 30.3F;
	
	char c1='A';
	char c2 =98;
	char c3=129;
	char c4 = '\u0040'; //unicode values.
	char c5 = 85;
	int i5 = 'A'; // int is converting into the char. then it is implicit type
	
	boolean b1=  true;
	boolean b21= false;

	public static void main(String[] args) {
		TestDatatypes1 t1 = new TestDatatypes1 ();
		System.out.println("byte values " +t1.b);
		System.out.println("byte values " +t1.b2);
		System.out.println("byte values " +t1.b3);
		System.out.println("byte values " +t1.b4);
		
		System.out.println("short valuee " +t1.s);
		System.out.println("short values " +t1.s1);
		
		System.out.println("int values " +t1.i);
		System.out.println("int values " +t1.i1);
		System.out.println("int values " +t1.i2);
		System.out.println("int values " +t1.i3);
		
		System.out.println("long values " +t1.l1);
		System.out.println("long values " +t1.l2);
		System.out.println("long values " +t1.l3);
		
		System.out.println("byte values " +t1.f1);
		System.out.println("byte values " +t1.f2);
		System.out.println("byte values " +t1.f3);
		System.out.println("byte values " +t1.f);
		
		System.out.println("double values " +t1.a1);
		System.out.println("double values " +t1.d);
		System.out.println("double values " +t1.d1);
		System.out.println("double values " +t1.d2);
		
		
		System.out.println("char values " +t1.c1);
		System.out.println("char values " +t1.c2);
		System.out.println("char values " +t1.c3);
		System.out.println("char values " +t1.c4);
		System.out.println("char values " +t1.c5);
		System.out.println("char values " +t1.i5);
		
	
		if(t1.b1) {
			System.out.println("Datatypes are easy!! ");
		}
		else {
			System.out.println("its not easy");
		}
		

		System.out.println("boolean values " + t1.b1);
		
		
	
	}

}
