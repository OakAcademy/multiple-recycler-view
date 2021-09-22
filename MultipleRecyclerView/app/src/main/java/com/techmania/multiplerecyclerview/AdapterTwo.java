package com.techmania.multiplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterTwo extends RecyclerView.Adapter<AdapterTwo.CountryTwoViewHolder> {

    ArrayList<Integer> animalList;
    ArrayList<String> animalNameList;

    public AdapterTwo(ArrayList<Integer> animalList, ArrayList<String> animalNameList) {
        this.animalList = animalList;
        this.animalNameList = animalNameList;
    }

    @NonNull
    @Override
    public CountryTwoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CountryTwoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryTwoViewHolder holder, int position) {
        holder.textView.setText(animalNameList.get(position));
        holder.imageView.setImageResource(animalList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalNameList.size();
    }

    public static class CountryTwoViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public CountryTwoViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textViewCountryName);

        }
    }

}
