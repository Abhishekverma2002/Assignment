package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mail= findViewById(R.id.button);
        Button phone= findViewById(R.id.button2);
        getSupportActionBar().hide();
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mail process will get initiated.",Toast.LENGTH_SHORT).show();
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"OTP process will get initiated.",Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void signup(View view) {
        startActivity(new Intent(MainActivity.this, SignUpAct.class));
        finish();
    }
}