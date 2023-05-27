package com.example.sharedatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,password,re_password,phone;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShowData.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                startActivity(intent);
            }
        });
    }
    public void init(){
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        re_password=findViewById(R.id.re_password);
        register=findViewById(R.id.register);
        phone=findViewById(R.id.phone);
    }
}