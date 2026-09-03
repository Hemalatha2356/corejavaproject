package com.oops;

public class Customer {
	private int customerid;
	private String name;
	private long phonenum;
	private String email;
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	
	public void setname(String name) {
		if(name!=null){
			this.name=name;
		}else {
			System.out.println("invalid");
		}
	}
	
	public String getname() {
		return name;
	}
	
	public void setphonenum(long phonenum) {
		if(phonenum>=1000000000L&&phonenum<=9999999999L) {
			this.phonenum=phonenum;
		}else {
			System.out.println("invalid");
		}
	}
	public long getphonenum() {
		return phonenum;
	}
	
	public void setemail(String email) {
		if(email!=null&&email.contains("@")) {
			this.email=email;
		}else {
			System.out.println("invalid");
		}
	}
	
	public String getemail() {
		return email;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!");
		System.out.println("customer info");
		Customer c1 = new Customer();
		c1.setCustomerid(101);
		c1.setname("hema");
		c1.setemail("hema@gmail.com");
		c1.setphonenum(1234567890L);
		
		System.out.println(c1.getCustomerid());
		System.out.println(c1.getname());
		System.out.println(c1.getemail());
		System.out.println(c1.getphonenum());
	
	}

}
