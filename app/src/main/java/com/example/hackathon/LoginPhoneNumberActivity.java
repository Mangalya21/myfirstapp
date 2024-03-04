package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

        phoneInput.addTextChangedListener(phoneTextWatcher);


       getOtpBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(LoginPhoneNumberActivity.this,LoginOtpActivity.class);
               intent.putExtra("phone",countryCode.getFullNumberWithPlus());
               startActivity(intent);

           }

       });


    }
    private TextWatcher phoneTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(countryCode.isValidFullNumber()){
                getOtpBtn.setEnabled(true);
                getOtpBtn.setBackgroundColor(Color.parseColor("#FFFF0000"));
            }else{
                getOtpBtn.setEnabled(false);
                getOtpBtn.setBackgroundColor(Color.parseColor("#FFFF9595"));
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}