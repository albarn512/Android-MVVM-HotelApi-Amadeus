package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Contact{

	@SerializedName("phone")
	private String phone;

	@SerializedName("fax")
	private String fax;

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setFax(String fax){
		this.fax = fax;
	}

	public String getFax(){
		return fax;
	}
}