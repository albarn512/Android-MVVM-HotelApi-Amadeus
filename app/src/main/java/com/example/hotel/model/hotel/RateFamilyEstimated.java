package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class RateFamilyEstimated{

	@SerializedName("code")
	private String code;

	@SerializedName("type")
	private String type;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}