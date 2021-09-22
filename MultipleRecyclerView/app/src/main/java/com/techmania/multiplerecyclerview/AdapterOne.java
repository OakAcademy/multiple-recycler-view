package com.techmania.multiplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.CountryOneViewHolder> {

    ArrayList<Integer> flagsList;
    ArrayList<String> nameList;

    public AdapterOne(ArrayList<Integer> flagsList, ArrayList<String> nameList) {
        this.flagsList = flagsList;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public CountryOneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CountryOneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryOneViewHolder holder, int position) {

        holder.textView.setText(nameList.get(position));
        holder.imageView.setImageResource(flagsList.get(position));

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public static class CountryOneViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public CountryOneViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textViewCountryName);

        }
    }

}
