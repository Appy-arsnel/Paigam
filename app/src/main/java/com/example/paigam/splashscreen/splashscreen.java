package com.example.paigam.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.paigam.R;
import com.example.paigam.onboarding_page1;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(splashscreen.this, onboarding_page1.class));
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);


    }
}