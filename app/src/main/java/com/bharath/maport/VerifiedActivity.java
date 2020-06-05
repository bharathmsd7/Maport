package com.bharath.maport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class VerifiedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verified);

        int timeout= 1500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                VerifiedActivity.this.startActivity(new Intent(VerifiedActivity.this,HomeActivity.class));
            }
        },timeout);
    }
}
