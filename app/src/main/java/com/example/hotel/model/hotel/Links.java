package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Links{

	@SerializedName("next")
	private String next;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}
}