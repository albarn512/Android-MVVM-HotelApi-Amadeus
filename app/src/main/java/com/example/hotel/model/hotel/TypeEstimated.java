package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class TypeEstimated{

	@SerializedName("category")
	private String category;

	@SerializedName("beds")
	private int beds;

	@SerializedName("bedType")
	private String bedType;

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setBeds(int beds){
		this.beds = beds;
	}

	public int getBeds(){
		return beds;
	}

	public void setBedType(String bedType){
		this.bedType = bedType;
	}

	public String getBedType(){
		return bedType;
	}
}