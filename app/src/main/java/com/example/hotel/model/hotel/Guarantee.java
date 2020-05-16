package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Guarantee{

	@SerializedName("acceptedPayments")
	private AcceptedPayments acceptedPayments;

	public void setAcceptedPayments(AcceptedPayments acceptedPayments){
		this.acceptedPayments = acceptedPayments;
	}

	public AcceptedPayments getAcceptedPayments(){
		return acceptedPayments;
	}
}