package com.example.hackathon;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class requestViewHolder extends RecyclerView.ViewHolder {
    TextView bloodbankname,dateofappoinment,status;
    public requestViewHolder(@NonNull View itemView) {
        super(itemView);
        bloodbankname=itemView.findViewById(R.id.bloodbankname);
        dateofappoinment=itemView.findViewById(R.id.dateofappoinment);
        status=itemView.findViewById((R.id.status));
    }
}
