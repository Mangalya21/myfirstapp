package com.example.hackathon;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class UserSignupActivity extends AppCompatActivity {
    Button registerbutton;
    EditText t1,t2,t3,t4,t5,t6;

    private static final String url="http://10.0.2.2/userdata/register.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);
        registerbutton=findViewById(R.id.user_button);

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registersuer();

            }
        });




    }

    private void registersuer() {
        t1=findViewById(R.id.name);
        t2=findViewById(R.id.birthdate);
        t3=findViewById(R.id.age);
        t4=findViewById(R.id.contactnumber);
        t5=findViewById(R.id.bloodgroup);
        t6=findViewById(R.id.gender);

        Intent regestered=new Intent(this, UserHomeActivity.class);
        final String name=t1.getText().toString().trim();
        final String birthdate=t2.getText().toString().trim();
        final String age=t3.getText().toString().trim();
        final String contact=t4.getText().toString().trim();
        final String bloodgroup=t5.getText().toString().trim();
        final String gender=t6.getText().toString().trim();

        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                Toast.makeText(UserSignupActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                startActivity(regestered);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(UserSignupActivity.this, volleyError.toString(), Toast.LENGTH_SHORT).show();


            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> param=new HashMap<String,String>();
                param.put("t1",name);
                param.put("t2",birthdate);
                param.put("t3",age);
                param.put("t4",contact);
                param.put("t5",bloodgroup);
                param.put("t6",gender);
                return param;
            }
        };

        RequestQueue queue= Volley.newRequestQueue(this);
        queue.add(request);



    }

}