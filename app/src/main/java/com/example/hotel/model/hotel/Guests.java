package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Guests{

	@SerializedName("adults")
	private int adults;

	public void setAdults(int adults){
		this.adults = adults;
	}

	public int getAdults(){
		return adults;
	}
}