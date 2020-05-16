package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class MediaItem{

	@SerializedName("category")
	private String category;

	@SerializedName("uri")
	private String uri;

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}
}