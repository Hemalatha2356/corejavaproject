package com.oops1.inheritance;

public class Bike extends VechicleImpl{
	@Override
	public double calculateRent(){
		return getRentalprice()*getRentaldays();
	}
	

}
