package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class OffersItem{

	@SerializedName("checkOutDate")
	private String checkOutDate;

	@SerializedName("price")
	private Price price;

	@SerializedName("guests")
	private Guests guests;

	@SerializedName("policies")
	private Policies policies;

	@SerializedName("rateFamilyEstimated")
	private RateFamilyEstimated rateFamilyEstimated;

	@SerializedName("id")
	private String id;

	@SerializedName("checkInDate")
	private String checkInDate;

	@SerializedName("rateCode")
	private String rateCode;

	@SerializedName("room")
	private Room room;

	public void setCheckOutDate(String checkOutDate){
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutDate(){
		return checkOutDate;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setGuests(Guests guests){
		this.guests = guests;
	}

	public Guests getGuests(){
		return guests;
	}

	public void setPolicies(Policies policies){
		this.policies = policies;
	}

	public Policies getPolicies(){
		return policies;
	}

	public void setRateFamilyEstimated(RateFamilyEstimated rateFamilyEstimated){
		this.rateFamilyEstimated = rateFamilyEstimated;
	}

	public RateFamilyEstimated getRateFamilyEstimated(){
		return rateFamilyEstimated;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCheckInDate(String checkInDate){
		this.checkInDate = checkInDate;
	}

	public String getCheckInDate(){
		return checkInDate;
	}

	public void setRateCode(String rateCode){
		this.rateCode = rateCode;
	}

	public String getRateCode(){
		return rateCode;
	}

	public void setRoom(Room room){
		this.room = room;
	}

	public Room getRoom(){
		return room;
	}
}