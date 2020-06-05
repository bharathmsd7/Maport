package com.bharath.maport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardingpassActivity extends AppCompatActivity {

    private Button btn_gotohome;
    private static final String CHANNEL_ID = "simplified_cod";
    private static final String CHANNEL_NAME = "simplified_cod";
    private static final String CHANNEL_DESC = "simplified_cod notifi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardingpass);

        btn_gotohome = findViewById(R.id.btn_gotohome);
        btn_gotohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(BoardingpassActivity.this, HomeActivity.class);
                startActivity(I);
            }
        });
    }
}
