package com.example.paigam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.paigam.onboarding.onboarding_page2;

public class onboarding_page1 extends AppCompatActivity {
     ImageView loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_page1);
        loginbutton=findViewById(R.id.loginpag1);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), onboarding_page2.class));

            }
        });
    }
}