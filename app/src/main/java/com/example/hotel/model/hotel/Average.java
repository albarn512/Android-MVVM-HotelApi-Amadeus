package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Average{

	@SerializedName("base")
	private String base;

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}