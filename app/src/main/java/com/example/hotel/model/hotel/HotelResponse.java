package com.example.hotel.model.hotel;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HotelResponse{

	@SerializedName("data")
	private ArrayList<DataItem> data;

	@SerializedName("meta")
	private Meta meta;

	public void setData(ArrayList<DataItem> data){
		this.data = data;
	}

	public ArrayList<DataItem> getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}
}