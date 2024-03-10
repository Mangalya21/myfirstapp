package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_page);
        Button bloodbankbutton = findViewById(R.id.blood_bank_button);
        Button userbutton = findViewById(R.id.user_button);
        userbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(SigninPage.this, OtpActivity.class);

                startActivity(user);
            }

        });

    }

    public void bloodbanklistner(View view){
        Intent bloodbank=new Intent(SigninPage.this, UserHomeActivity.class);
        startActivity(bloodbank);



    }
}