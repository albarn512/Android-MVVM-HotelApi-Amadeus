package com.example.hotel.view.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hotel.model.hotel.DataItem;
import com.example.hotel.model.hotel.HotelResponse;
import com.example.hotel.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HotelViewModel extends ViewModel {
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<DataItem>> hotelList = new MutableLiveData<ArrayList<DataItem>>();

    public void setHotel(){
        if (this.apiMain == null){
            apiMain = new ApiMain();
        }

        apiMain.getApiHotel().getHotelDiscover().enqueue(new Callback<HotelResponse>() {
            @Override
            public void onResponse(Call<HotelResponse> call, Response<HotelResponse> response) {
                Log.d("Response", " body = " + response.body());
                HotelResponse hotelResponse = response.body();
                if (hotelResponse !=null && hotelResponse.getData() !=null){
                    ArrayList<DataItem> hotelItems = hotelResponse.getData();
                    hotelList.postValue(hotelItems);
                }
            }


            @Override
            public void onFailure(Call<HotelResponse> call, Throwable t) {
                Log.e("Failure","");
            }
        });
    }

    public LiveData<ArrayList<DataItem>> getHotel(){
        return hotelList;
    }
}
