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
import java.util.zip.Inflater;

public class FoodFragment extends Fragment {
    View view;
    RecyclerView foodrecycler;
    DataAdapter foodAdapter;
    List<Data> dataList;
    public FoodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_food,container,false);

        foodrecycler=(RecyclerView) view.findViewById(R.id.food_recycler);
        foodAdapter=new DataAdapter(getContext(),dataList);
        foodrecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        foodrecycler.setAdapter(foodAdapter);
        return view;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataList=new ArrayList<>();
        dataList.add(new Data("Pizza",R.drawable.food_pizza,"https://en.wikipedia.org/wiki/Pizza","https://www.google.co.in/maps/place/Domino's+Pizza/@18.516468,73.8247344,14z/data=!4m9!1m2!2m1!1s+dominos+Shivajinagar,+Pune,+Maharashtra!3m5!1s0x3bc2c077fb3b7107:0x971d551b0ffecc71!8m2!3d18.516468!4d73.8422439!15sCidkb21pbm9zIFNoaXZhamluYWdhciwgUHVuZSwgTWFoYXJhc2h0cmEiA4gBAVonIiVkb21pbm9zIHNoaXZhamluYWdhciBwdW5lIG1haGFyYXNodHJhkgEQcGl6emFfcmVzdGF1cmFudJoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VObmJ6Z3pMV3BSUlJBQg"));
        dataList.add(new Data("Chinese",R.drawable.food_chineese,"https://en.wikipedia.org/wiki/Chinese_cuisine","https://www.google.co.in/maps/place/CHINA+GATE/@18.5293728,73.8230893,14z/data=!4m9!1m2!2m1!1s+chinese+shivajinagar+Pune,+Maharashtra!3m5!1s0x3bc2c079ad828a01:0xf94c2ac79f035954!8m2!3d18.5196141!4d73.8452163!15sCiZjaGluZXNlIHNoaXZhamluYWdhciBQdW5lLCBNYWhhcmFzaHRyYVonIiVjaGluZXNlIHNoaXZhamluYWdhciBwdW5lIG1haGFyYXNodHJhkgESY2hpbmVzZV9yZXN0YXVyYW50mgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVU0wTWtwMlRGRkJFQUU"));
        dataList.add(new Data("Tapas",R.drawable.food_tapas,"https://en.wikipedia.org/wiki/Bhel_puri#:~:text=Bhelpuri%20is%20a%20savoury%20snack,such%20as%20Chowpatty%20or%20Juhu.","https://www.google.co.in/maps/place/Ganesh+Bhel/@18.5294526,73.8230893,14z/data=!4m9!1m2!2m1!1s+bhel+shivajinagar+Pune,+Maharashtra!3m5!1s0x3bc2bf80b2fc7f37:0x9f15ed1f2b931720!8m2!3d18.522849!4d73.841122!15sCiNiaGVsIHNoaXZhamluYWdhciBQdW5lLCBNYWhhcmFzaHRyYVokIiJiaGVsIHNoaXZhamluYWdhciBwdW5lIG1haGFyYXNodHJhkgEUZmFzdF9mb29kX3Jlc3RhdXJhbnQ"));
        dataList.add(new Data("Burger",R.drawable.food_burger,"https://en.wikipedia.org/wiki/Burger","https://www.google.co.in/maps/place/Burger+King/@18.5338213,73.8122517,14z/data=!4m5!3m4!1s0x3bc2bf70a134350b:0xcf6eb0d2abadf749!8m2!3d18.5338213!4d73.8297612"));
        dataList.add(new Data("Paella",R.drawable.food_paella,"https://en.wikipedia.org/wiki/Dosa","https://www.google.co.in/maps/place/Niranjan/@18.5339808,73.8122517,14z/data=!4m5!3m4!1s0x3bc2c07f87527b9b:0xcb43127c0ad86c2a!8m2!3d18.5261957!4d73.841966"));



    }


}
