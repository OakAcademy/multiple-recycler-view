package com.techmania.multiplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterThree extends RecyclerView.Adapter<AdapterThree.CountryThreeViewHolder> {

    ArrayList<Integer> languageList;
    ArrayList<String> languageNameList;

    public AdapterThree(ArrayList<Integer> languageList, ArrayList<String> languageNameList) {
        this.languageList = languageList;
        this.languageNameList = languageNameList;
    }

    @NonNull
    @Override
    public CountryThreeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CountryThreeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryThreeViewHolder holder, int position) {
        holder.textView.setText(languageNameList.get(position));
        holder.imageView.setImageResource(languageList.get(position));
    }

    @Override
    public int getItemCount() {
        return languageNameList.size();
    }

    public static class CountryThreeViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public CountryThreeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textViewCountryName);

        }
    }
}
