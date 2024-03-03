package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Patterns;

import com.hbb20.CountryCodePicker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LoginPhoneNumberActivity extends AppCompatActivity {

    CountryCodePicker countryCode;
    EditText phoneInput;
    Button getOtpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        countryCode = findViewById(R.id.country_code);
        phoneInput = findViewById(R.id.phone_input);
        getOtpBtn = findViewById(R.id.get_otp_btn);

        countryCode.registerCarrierNumberEditText(phoneInput);
       getOtpBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (!countryCode.isValidFullNumber()){
                   phoneInput.setError("Phone number not valid");
               }
               else {
                   Intent intent = new Intent(LoginPhoneNumberActivity.this,LoginOtpActivity.class);
                   intent.putExtra("phone",countryCode.getFullNumberWithPlus());
                   startActivity(intent);
               }
           }

       });


    }

}