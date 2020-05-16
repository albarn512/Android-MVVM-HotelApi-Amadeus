package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Commission{

	@SerializedName("amount")
	private String amount;

	@SerializedName("percentage")
	private String percentage;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setPercentage(String percentage){
		this.percentage = percentage;
	}

	public String getPercentage(){
		return percentage;
	}
}