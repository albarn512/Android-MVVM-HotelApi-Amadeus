package com.example.hotel.model.hotel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Variations{

	@SerializedName("average")
	private Average average;

	@SerializedName("changes")
	private List<ChangesItem> changes;

	public void setAverage(Average average){
		this.average = average;
	}

	public Average getAverage(){
		return average;
	}

	public void setChanges(List<ChangesItem> changes){
		this.changes = changes;
	}

	public List<ChangesItem> getChanges(){
		return changes;
	}
}