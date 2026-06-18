package com.fundamentals;

public class objectcount {
	//static block
	static int count;
	
	//instances
	{
		count+=1;
	
	}
	
	public static void main(String[] args) {
		
		objectcount a=new objectcount();
		objectcount b= new objectcount();
		objectcount c=new objectcount();
		
		System.out.println("count "+ objectcount.count);
	}

}
