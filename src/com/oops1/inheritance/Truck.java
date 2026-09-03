package com.oops1.inheritance;

public class Truck extends VechicleImpl{
	@Override
	public double calculateRent(){
		return getRentalprice()*getRentaldays();
	}
	

	public static void main(String[] args) {
	VechicleImpl v1 = new VechicleImpl();
	
//	v1.setCustomerdetails("name");
//	v1.setRentaldays(10);
	v1.setRentalprice(10000);
	v1.setSecuritydeposite(1000);
	v1.setVehicleavailability(true);
	v1.calculateRent();
	System.out.println(v1.calculateRent());
	System.out.println(	v1.checkAvailability());
	

	System.out.println(v1.getCustomerdetails());
	System.out.println(v1.getRentaldays());
	System.out.println(v1.getRentalprice());
	System.out.println(v1.getSecurityDeposit());
	
	}

}
