package com.oops1;

public class Customer {
	
	private int coustomerid;
	private String name;
	private long phonenumber;
	private String email;
	
	public int getCoustomerid() {
		return coustomerid;
	}
	public void setCoustomerid(int coustomerid) {
		this.coustomerid = coustomerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}else {
			System.out.println("invalid");
		}
		
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		if(phonenumber>=1000000000L&&phonenumber<=9999999999L) {
			this.phonenumber = phonenumber;
		}else {
			System.out.println("invalid");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
       if(email!=null&&email.contains("@")) {
    		  this.email = email;
		}else {
			System.out.println("invalid");
		}
		
	}
	
	

}
