package com.example.android.tourguideapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguideapp.Adapers.DataAdapter;
import com.example.android.tourguideapp.Model.Data;
import com.example.android.tourguideapp.R;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {
    View view;
    RecyclerView hotelrecyler;
    DataAdapter hotelAdapter;
    List<Data>  hoteldata;

    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_hotel,container,false);

    hotelrecyler=(RecyclerView) view.findViewById(R.id.hotel_recycler);
    hotelAdapter=new DataAdapter(getContext(),hoteldata);
    hotelrecyler.setLayoutManager(new LinearLayoutManager(getActivity()));
    hotelrecyler.setAdapter(hotelAdapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hoteldata=new ArrayList<>();
        hoteldata.add(new Data(R.string.aqua,R.Aquadrawable.hotel_aqua));
        hoteldata.add(new Data(R.string.oriental,R.drawable.hotel_mandarin));
        hoteldata.add(new Data(R.string.arts,R.drawable.hotel_arts));
        hoteldata.add(new Data(R.string.axel,R.drawable.hotel_axel));
        hoteldata.add(new Data(R.string.w,R.drawable.hotel_w));
    }
}
