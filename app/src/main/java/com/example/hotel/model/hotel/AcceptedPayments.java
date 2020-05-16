package com.example.hotel.model.hotel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AcceptedPayments{

	@SerializedName("creditCards")
	private List<String> creditCards;

	@SerializedName("methods")
	private List<String> methods;

	public void setCreditCards(List<String> creditCards){
		this.creditCards = creditCards;
	}

	public List<String> getCreditCards(){
		return creditCards;
	}

	public void setMethods(List<String> methods){
		this.methods = methods;
	}

	public List<String> getMethods(){
		return methods;
	}
}