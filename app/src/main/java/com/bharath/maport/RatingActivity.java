package com.bharath.maport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    TextView titlerate , resultrate;
    Button btnfeedback;
    ImageView r1;
    RatingBar ratestar;
    String answerValue;
    Animation charanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        titlerate = findViewById(R.id.titlerate);
        resultrate = findViewById( R.id.resultrate);
        btnfeedback = findViewById(R.id.btn_feedback);
        r1 = findViewById(R.id.r3);
        ratestar = findViewById(R.id.ratestar);

        //loadanimation
        charanim = AnimationUtils.loadAnimation(this,R.anim.charanim);
        r1.startAnimation(charanim);

        ratestar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                answerValue = String.valueOf((int)(ratestar.getRating()));
                if(answerValue.equals("1")){
                    r1.setImageResource(R.drawable.r1);
                    r1.startAnimation(charanim);
                    resultrate.setText("Poor");
                }
                else if(answerValue.equals("2")){
                    r1.setImageResource(R.drawable.r2);
                    r1.startAnimation(charanim);
                    resultrate.setText("Not Worthy");
                }
                else if(answerValue.equals("3")){
                    r1.setImageResource(R.drawable.r3);
                    r1.startAnimation(charanim);
                    resultrate.setText("Somewhat ok");
                }
                else if(answerValue.equals("4")){
                    r1.setImageResource(R.drawable.r4);
                    r1.startAnimation(charanim);
                    resultrate.setText("Very Good");
                }
                else if(answerValue.equals("5")){
                    r1.setImageResource(R.drawable.r5);
                    r1.startAnimation(charanim);
                    resultrate.setText("Excellent Service");
                }
                else{
                    Toast.makeText(getApplicationContext(), "No Rating", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
