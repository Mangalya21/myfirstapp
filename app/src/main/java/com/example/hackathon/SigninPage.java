package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninPage extends AppCompatActivity {

    Button userBtn = findViewById(R.id.user_btn);
    Button bloodBankBtn = findViewById(R.id.blood_bank_btn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_page);

        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninPage.this,LoginPhoneNumberActivity.class);
                startActivity(intent);
            }
        });

    }
}