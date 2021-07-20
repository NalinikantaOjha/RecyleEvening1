package com.example.recycleevening1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private itemClickListner itemcClickListner;
    private ArrayList<Model> arrayList=new ArrayList<>();
    public Adapter(ArrayList<Model>arrayList,itemClickListner itemcClickListner){
        this.arrayList=arrayList;
        this.itemcClickListner=itemcClickListner;
    }
    @NonNull

    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ArticleViewHolder(view,itemcClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  ArticleViewHolder holder, int position) {
        Model view=arrayList.get(position);
        holder.setData(view);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }






}


