package com.example.hotel.model.hotel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Address{

	@SerializedName("cityName")
	private String cityName;

	@SerializedName("countryCode")
	private String countryCode;

	@SerializedName("postalCode")
	private String postalCode;

	@SerializedName("lines")
	private List<String> lines;

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public String getCityName(){
		return cityName;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setLines(List<String> lines){
		this.lines = lines;
	}

	public List<String> getLines(){
		return lines;
	}
}