package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent intent=new Intent(this, SigninPage.class);

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        };
        Handler handler=new Handler();
        handler.postDelayed(runnable,2000);

    }
}