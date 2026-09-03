package com.oops1;

import java.util.Arrays;

public class Shoopingcart {
	private String[] cartItems = new String[5];
	private String carItems;
	private int totalamount=0;
	private int count=0;
	
	@Override
	public String toString() {
		return "Shoopingcart [cartItems=" + Arrays.toString(cartItems) + ", carItems=" + carItems + ", totalamount="
				+ totalamount + ", count=" + count + ", gettotal()=" + gettotal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	void additem(String item,int price) {
		cartItems[count] =item;
		count++;
		totalamount=totalamount+price;
	}
	
	void removeitems(int price, String item) {
	    for (int i = 0; i < count; i++) {
	        if (cartItems[i].equals(item)) {
	            for (int j = i; j < count - 1; j++) {
	                cartItems[j] = cartItems[j + 1];
	            }
	            cartItems[count - 1] = null;
	            count--;
	            totalamount = totalamount - price;
	            return;
	        }
	    }
	}
	
//	void removeitems(int price,String item) {
//		for(int i=0;i<count;i++) {
//			if(cartItems[i].equals(item)) {
//				cartItems[i]=null;
//				totalamount=totalamount-price;
//				return;
//			}
//		}
//		
//	}
	
	double gettotal() {
	return totalamount;
	}
	

}
