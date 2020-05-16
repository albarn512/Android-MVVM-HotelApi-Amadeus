package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Room{

	@SerializedName("typeEstimated")
	private TypeEstimated typeEstimated;

	@SerializedName("description")
	private Description description;

	@SerializedName("type")
	private String type;

	public void setTypeEstimated(TypeEstimated typeEstimated){
		this.typeEstimated = typeEstimated;
	}

	public TypeEstimated getTypeEstimated(){
		return typeEstimated;
	}

	public void setDescription(Description description){
		this.description = description;
	}

	public Description getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}