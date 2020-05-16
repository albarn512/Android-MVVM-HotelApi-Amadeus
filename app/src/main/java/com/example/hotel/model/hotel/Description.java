package com.example.hotel.model.hotel;

import com.google.gson.annotations.SerializedName;

public class Description{

	@SerializedName("text")
	private String text;

	@SerializedName("lang")
	private String lang;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setLang(String lang){
		this.lang = lang;
	}

	public String getLang(){
		return lang;
	}
}