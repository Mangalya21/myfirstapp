package com.example.hackathon;

import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RequestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_request_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        List<requestMenuItems>items= new ArrayList<requestMenuItems>();
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));
        items.add(new requestMenuItems("blood bank","Date:21-03-2024","Not Approved"));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RequestMenuAdaptor(getApplicationContext(),items));
    }
}