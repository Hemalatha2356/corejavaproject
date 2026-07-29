package com.keywords;

public class Wrapperobjectmethod {

	public static void main(String[] args) {
		
		//integer.parselnt;
		String num= "100"; 
		int number=Integer.parseInt(num);
		System.out.println("Integer value "+ number);
		System.out.println((number-20));
		
		//Double.parseDouble
		String decimal = "78.98";
		Double decimal1 = Double.parseDouble(decimal);
		System.out.println("Double value "+ decimal1);
		double s1=(double) (decimal1 + 34.3);
        int sum1= (int) (decimal1 +67);// implicit type casting	
         
        System.out.println(sum1);
		//Boolean.parseBoolean
		String b1 = "true"; 
		boolean b2 = Boolean.parseBoolean(b1);
		System.out.println("Boolean value " + b2);
		
		//character.toString
		char ch='A';
		String s2 = Character.toString(ch);
		
		System.out.println("Character value "+ s2);

	}
}
