package com.example.hotel.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotel.R;
import com.example.hotel.adapter.hotel.HotelAdapter;
import com.example.hotel.model.hotel.DataItem;
import com.example.hotel.view.viewmodel.HotelViewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private HotelAdapter hotelAdapter;
    private RecyclerView recyclerView;
    private HotelViewModel hotelViewModel;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hotelAdapter = new HotelAdapter(getContext());
        hotelAdapter.notifyDataSetChanged();

        recyclerView = view.findViewById(R.id.recyclerview_list);

        hotelViewModel = new ViewModelProvider(this).get(HotelViewModel.class);
        hotelViewModel.setHotel();
        hotelViewModel.getHotel().observe(this,getHotel);

        recyclerView.setAdapter(hotelAdapter);
    }

    private Observer<ArrayList<DataItem>> getHotel = new Observer<ArrayList<DataItem>>() {
        @Override
        public void onChanged(ArrayList<DataItem> hotelItems) {
            if (hotelItems!=null){
                hotelAdapter.setData(hotelItems);
            }
        }
    };
}
