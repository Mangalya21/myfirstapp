package com.example.hackathon;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RequestMenuAdaptor extends RecyclerView.Adapter<requestViewHolder>{
    Context context;
    List<requestMenuItems> items;

    public RequestMenuAdaptor(Context context, List<requestMenuItems> items) {
        this.context = context;
       this.items=items;
    }

    @NonNull
    @Override
    public requestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new requestViewHolder(LayoutInflater.from(context).inflate(R.layout.requestmenumodel,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull requestViewHolder holder, int position) {
        holder.bloodbankname.setText(items.get(position).getBloodBankName());
        holder.dateofappoinment.setText(items.get(position).getDateOfAppoinment());
        holder.status.setText(items.get(position).getApprovalStatus());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
