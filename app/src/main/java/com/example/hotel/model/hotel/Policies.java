package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Policies{

	@SerializedName("cancellation")
	private Cancellation cancellation;

	@SerializedName("guarantee")
	private Guarantee guarantee;

	@SerializedName("paymentType")
	private String paymentType;

	public void setCancellation(Cancellation cancellation){
		this.cancellation = cancellation;
	}

	public Cancellation getCancellation(){
		return cancellation;
	}

	public void setGuarantee(Guarantee guarantee){
		this.guarantee = guarantee;
	}

	public Guarantee getGuarantee(){
		return guarantee;
	}

	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}

	public String getPaymentType(){
		return paymentType;
	}
}