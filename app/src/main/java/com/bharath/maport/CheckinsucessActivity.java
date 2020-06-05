package com.bharath.maport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class CheckinsucessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkinsucess);

        int timeout= 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                CheckinsucessActivity.this.startActivity(new Intent(CheckinsucessActivity.this,BoardingpassActivity.class));
            }
        },timeout);
    }
}
