package com.example.hotel.model.hotel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("offers")
	private List<OffersItem> offers;

	@SerializedName("available")
	private boolean available;

	@SerializedName("hotel")
	private Hotel hotel;

	@SerializedName("self")
	private String self;

	@SerializedName("type")
	private String type;

	public void setOffers(List<OffersItem> offers){
		this.offers = offers;
	}

	public List<OffersItem> getOffers(){
		return offers;
	}

	public void setAvailable(boolean available){
		this.available = available;
	}

	public boolean isAvailable(){
		return available;
	}

	public void setHotel(Hotel hotel){
		this.hotel = hotel;
	}

	public Hotel getHotel(){
		return hotel;
	}

	public void setSelf(String self){
		this.self = self;
	}

	public String getSelf(){
		return self;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}