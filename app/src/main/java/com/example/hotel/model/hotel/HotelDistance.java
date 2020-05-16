package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class HotelDistance{

	@SerializedName("distanceUnit")
	private String distanceUnit;

	@SerializedName("distance")
	private double distance;

	public void setDistanceUnit(String distanceUnit){
		this.distanceUnit = distanceUnit;
	}

	public String getDistanceUnit(){
		return distanceUnit;
	}

	public void setDistance(double distance){
		this.distance = distance;
	}

	public double getDistance(){
		return distance;
	}
}