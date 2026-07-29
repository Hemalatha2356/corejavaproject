
package com.operators;

public class Uniaryop1 {

	public static void main(String[] args) {
		int x=5;
		int y=7;
		System.out.println(--x);//4
		System.out.println(x--);//4
		System.out.println(++x);//4
		System.out.println(x++);//4
		System.out.println(--x);//4
		System.out.println(x--);//4
		
		System.out.println("x value is : " + x);
		System.out.println(--y);//6
		System.out.println(y--);//6--> 5
		System.out.println(++y);//6
		System.out.println(y++);//6-->7
		System.out.println(--y);//6
	
		System.out.println(y--);//6-->5
		
		System.out.println("y value is : " + y);
		System.out.println(x++ + y++ - y-- + ++x);
		//5-->6, + 7--> 8 - 8--> 7, + 7
		//5+7-8+7
		//12-8+7
		//3+7=11
		
		int a=9;
		
		int b=8;
		System.out.println("****************************");
		System.out.println(++a);//10
		System.out.println(a++);//10-->11
		System.out.println(--a);//10
		System.out.println(a--);//10-->9
		System.out.println(++a);//10
		
		System.out.println(b++);//8-->9
		System.out.println(++b);//10
		System.out.println(b--);//10-->9
		System.out.println(--b);//8
		System.out.println(b++);//8-->9
		System.out.println("******************************************");
		System.out.println(a++ + b++ - b-- + ++a);
		//9-->10,+ 8-->9 , - 9-->8 + 11
		//9+8-9+11
		//17-9+11
		//8+11
		
		

	}

}
