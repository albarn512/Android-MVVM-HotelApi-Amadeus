package com.example.hotel.model.hotel;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Hotel{

	@SerializedName("amenities")
	private List<String> amenities;

	@SerializedName("address")
	private Address address;

	@SerializedName("chainCode")
	private String chainCode;

	@SerializedName("cityCode")
	private String cityCode;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("dupeId")
	private String dupeId;

	@SerializedName("rating")
	private String rating;

	@SerializedName("description")
	private Description description;

	@SerializedName("hotelId")
	private String hotelId;

	@SerializedName("media")
	private ArrayList<MediaItem> media;

	@SerializedName("type")
	private String type;

	@SerializedName("hotelDistance")
	private HotelDistance hotelDistance;

	@SerializedName("contact")
	private Contact contact;

	@SerializedName("name")
	private String name;

	@SerializedName("longitude")
	private double longitude;

	public void setAmenities(List<String> amenities){
		this.amenities = amenities;
	}

	public List<String> getAmenities(){
		return amenities;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setChainCode(String chainCode){
		this.chainCode = chainCode;
	}

	public String getChainCode(){
		return chainCode;
	}

	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	public String getCityCode(){
		return cityCode;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setDupeId(String dupeId){
		this.dupeId = dupeId;
	}

	public String getDupeId(){
		return dupeId;
	}

	public void setRating(String rating){
		this.rating = rating;
	}

	public String getRating(){
		return rating;
	}

	public void setDescription(Description description){
		this.description = description;
	}

	public Description getDescription(){
		return description;
	}

	public void setHotelId(String hotelId){
		this.hotelId = hotelId;
	}

	public String getHotelId(){
		return hotelId;
	}

	public void setMedia(ArrayList<MediaItem> media){
		this.media = media;
	}

	public ArrayList<MediaItem> getMedia(){
		return media;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setHotelDistance(HotelDistance hotelDistance){
		this.hotelDistance = hotelDistance;
	}

	public HotelDistance getHotelDistance(){
		return hotelDistance;
	}

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}
}