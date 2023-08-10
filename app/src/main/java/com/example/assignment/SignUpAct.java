package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class SignUpAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("SignUp Page");
        Button create= findViewById(R.id.button3);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Account created",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}