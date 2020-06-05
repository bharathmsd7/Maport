package com.bharath.materialdesign.maport;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CheckinActivity extends AppCompatActivity {

    Button popupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);

        popupbtn = findViewById(R.id.btn_popup);


        popupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(CheckinActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(true);
                bottomSheetDialog.show();

                Button btnconform = bottomSheetDialog.findViewById(R.id.btn_conform);

                btnconform.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent I = new Intent(CheckinActivity.this, SeatselectionActivity.class);
                        startActivity(I);
                    }
                });
            }
        });
    }
}
