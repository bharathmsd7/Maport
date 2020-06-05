package com.bharath.maport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaidActivity extends AppCompatActivity {

    private Button btn_paid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid);

        btn_paid = findViewById(R.id.btn_ok);
        btn_paid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(PaidActivity.this, TicketdetailsActivity.class);
                startActivity(I);
            }
        });
    }
}
