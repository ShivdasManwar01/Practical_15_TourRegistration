package com.example.sharedatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    TextView name,email,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        init();
        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
        email.setText(intent.getStringExtra("email"));
        phone.setText(intent.getStringExtra("phone"));
    }
    public void init(){
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
    }
}