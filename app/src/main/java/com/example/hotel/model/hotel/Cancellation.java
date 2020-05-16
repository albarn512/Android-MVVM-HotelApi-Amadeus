package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Cancellation{

	@SerializedName("numberOfNights")
	private int numberOfNights;

	@SerializedName("deadline")
	private String deadline;

	public void setNumberOfNights(int numberOfNights){
		this.numberOfNights = numberOfNights;
	}

	public int getNumberOfNights(){
		return numberOfNights;
	}

	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	public String getDeadline(){
		return deadline;
	}
}