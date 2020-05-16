package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Price{

	@SerializedName("total")
	private String total;

	@SerializedName("variations")
	private Variations variations;

	@SerializedName("currency")
	private String currency;

	@SerializedName("base")
	private String base;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setVariations(Variations variations){
		this.variations = variations;
	}

	public Variations getVariations(){
		return variations;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}