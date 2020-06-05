package com.bharath.maport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class SeatselectionActivity extends AppCompatActivity {

    Button btn_board;
    ToggleButton btn_green_seat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatselection);

        btn_green_seat = findViewById(R.id.seat);
        btn_green_seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_green_seat.setBackgroundResource(R.drawable.seat_green);
            }
        });

        btn_board = findViewById(R.id.btn_board);
        btn_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(SeatselectionActivity.this, NoticeActivity.class);
                startActivity(I);
            }
        });
    }
}
