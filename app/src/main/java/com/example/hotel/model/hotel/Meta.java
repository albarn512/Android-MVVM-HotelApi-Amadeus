package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("links")
	private Links links;

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}
}