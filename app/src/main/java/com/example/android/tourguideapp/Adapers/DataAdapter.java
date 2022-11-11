package com.example.android.tourguideapp.Adapers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguideapp.DetailActivity;
import com.example.android.tourguideapp.Model.Data;
import com.example.android.tourguideapp.R;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    Context context;
    List<Data> dataList;

    public DataAdapter(Context context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.data_row_item,parent,false);

        return  new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(dataList.get(position).getImageUrl());
        holder.name.setText(dataList.get(position).getName());
   //     holder.web.setImageResource(dataList.get(position).getWeb_search());
   //     holder.loc.setImageResource(dataList.get(position).getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, DetailActivity.class);
                i.putExtra("Image",(dataList.get(position).getImageUrl()));
                i.putExtra("name",(dataList.get(position).getName()));
                i.putExtra("web",(dataList.get(position).getWeb_search()));
                i.putExtra("loc",(dataList.get(position).getWeb_search()));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView image,web,loc;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textView);
            image=itemView.findViewById(R.id.imageView);
            web=itemView.findViewById(R.id.web);
            loc=itemView.findViewById(R.id.loc);
        }
    }
}
