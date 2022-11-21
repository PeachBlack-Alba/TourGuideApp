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

public class PlacesFragment extends Fragment {
    View view;
    RecyclerView placerecycler;
    DataAdapter placeadapter;
    List<Data> placedata;
    public PlacesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_places,container,false);

        placerecycler=(RecyclerView) view.findViewById(R.id.places_recycler);
        placeadapter=new DataAdapter(getContext(),placedata);
        placerecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        placerecycler.setAdapter(placeadapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        placedata=new ArrayList<>();
        placedata.add(new Data(R.string.sagrada,R.drawable.place_sagrada));
        placedata.add(new Data(R.string.gothic,R.drawable.place_gothic));
        placedata.add(new Data(R.string.pedrera,R.drawable.place_pedrera));
        placedata.add(new Data(R.string.bogatell,R.drawable.place_bogatell));
        placedata.add(new Data(R.string.music,R.drawable.place_musica));
    }
}
