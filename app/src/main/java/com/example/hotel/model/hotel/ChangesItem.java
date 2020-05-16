package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class ChangesItem{

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("base")
	private String base;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}