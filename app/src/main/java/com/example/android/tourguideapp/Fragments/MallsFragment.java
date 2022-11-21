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

public class MallsFragment extends Fragment {
    View view;
    RecyclerView mallrecycler;
    DataAdapter mallAdapter;
    List<Data> malldata;

    public MallsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_malls,container,false);
        mallrecycler=(RecyclerView) view.findViewById(R.id.malls_recycler);
        mallAdapter=new DataAdapter(getContext(),malldata);
        mallrecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mallrecycler.setAdapter(mallAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        malldata=new ArrayList<>();
        malldata.add(new Data(R.string.arenas,R.drawable.mall_arenas));
        malldata.add(new Data(R.string.maquinista,R.drawable.mall_maquinista));
        malldata.add(new Data(R.string.maremagnum,R.drawable.mall_maremagnum));
        malldata.add(new Data(R.string.diagonal,R.drawable.mall_diagonal));
        malldata.add(new Data(R.string.pedralbes,R.drawable.mall_pedralbes));
    }
}
