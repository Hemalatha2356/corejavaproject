package com.oops1;

public class Testshoopingcart {

	public static void main(String[] args) {
		Shoopingcart s1 = new Shoopingcart();
		s1.additem("mobile",56789);
		s1.additem("laptop",98768);
		s1.additem("mouse",569);
		s1.removeitems(56789, "mobile");
		System.out.println("totalamount = " + s1.gettotal());
	}

}
