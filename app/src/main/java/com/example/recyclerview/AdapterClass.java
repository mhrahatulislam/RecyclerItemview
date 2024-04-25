package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.Viewholder> {

    private final ArrayList<String> languageRVModalArrayList;
    public AdapterClass(ArrayList<String> languageRVModalArrayList, Context context) {
        this.languageRVModalArrayList = languageRVModalArrayList;
    }


    @NonNull
    @Override
    public AdapterClass.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemvies, parent, false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.Viewholder holder, int position) {

        holder.lagTV.setText(languageRVModalArrayList.get(position));


    }

    @Override
    public int getItemCount() {
        return languageRVModalArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

       private final TextView lagTV;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            lagTV=itemView.findViewById(R.id.idTVLngName);

        }
    }
}
