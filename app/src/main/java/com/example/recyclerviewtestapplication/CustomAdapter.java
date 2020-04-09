package com.example.recyclerviewtestapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<EntityNews> entityNewsArrayList;
    Context context;

    public CustomAdapter(ArrayList<EntityNews> entityNewsArrayList, Context context) {
        this.entityNewsArrayList = entityNewsArrayList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull List<Object> payloads) {
        ImageView img_thumb = holder.img_thumb;
        ImageView img_more = holder.img_more;
        TextView tv_country = holder.tv_country;
        TextView tv_headline = holder.tv_headline;

        tv_country.setText(entityNewsArrayList.get(position).getCountry());
        tv_headline.setText(entityNewsArrayList.get(position).getHeadline());
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View view = li.inflate(R.layout.entity_news, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_thumb, img_more;
        TextView tv_country, tv_headline;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_thumb = itemView.findViewById(R.id.img_thumb);
            img_more = itemView.findViewById(R.id.img_more);
            tv_country = itemView.findViewById(R.id.tv_country);
            tv_headline = itemView.findViewById(R.id.tv_headline);
        }
    }
}
