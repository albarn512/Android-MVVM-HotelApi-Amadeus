package com.example.hotel.adapter.hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hotel.R;
import com.example.hotel.model.hotel.DataItem;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    private ArrayList<DataItem> hotelItem = new ArrayList<>();
    private Context context;

    public HotelAdapter(Context context){ this.context = context;}

    public void setData(ArrayList<DataItem> items){
        hotelItem.clear();
        hotelItem.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(hotelItem.get(position)
                .getHotel().getMedia().get(position).getUri())
                .into(holder.ivThumb);
    }

    @Override
    public int getItemCount() {
        return hotelItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumb;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivThumb = itemView.findViewById(R.id.iv_hotel);
        }
    }
}
