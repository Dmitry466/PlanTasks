package com.example.plantasks.Utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.plantasks.R;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Objects.requireNonNull(getSupportActionBar()).hide();

        final Intent i = new Intent(SplashActivity.this, MainActivity.class);
        new Handler().postDelayed(() -> {
            startActivity(i);
            finish();
        }, 2000);
    }
}