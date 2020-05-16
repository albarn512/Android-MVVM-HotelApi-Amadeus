package com.example.hotel.service;

import com.example.hotel.model.hotel.HotelResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface HotelRepository {
    @Headers("Authorization: Bearer nrGw058lss5axwHqZTaoGoQ42n5LQXTV")
    @GET("/v2/shopping/hotel-offers?cityCode=PAR&adults=1&radius=5&radiusUnit=KM&paymentPolicy=NONE&includeClosed=false&bestRateOnly=true&view=FULL&sort=PRICE")
    Call<HotelResponse> getHotelDiscover();
}
