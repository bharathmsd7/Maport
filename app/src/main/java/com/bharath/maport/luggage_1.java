package com.bharath.maport;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class luggage_1 extends AppCompatActivity implements ValueEventListener {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myref = database.getReference();
    private DatabaseReference childref = myref.child("bagno").child("6E 5078");
    public TextView textView,textView2,textView3,textView4;
    public ImageView bg;

    //notification channel
    //notificaition builder
    //notification manager
    private static final String CHANNEL_ID = "simplified_coding";
    private static final String CHANNEL_NAME = "simplified_coding";
    private static final String CHANNEL_DESC = "simplified_coding notifi";


    @SuppressLint("ObsoleteSdkInt")
    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luggage_1);
        //final Activity activity = this;


        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
        channel.setDescription(CHANNEL_DESC);
        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(channel);
        bg = findViewById(R.id.bg);
        textView = findViewById(R.id.textchanger);
        textView2 = findViewById(R.id.textchanger2);
        textView3 = findViewById(R.id.textchanger3);
        textView4 = findViewById(R.id.textchanger4);

    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        if (dataSnapshot.getValue(String.class) != null) {
            String temp = dataSnapshot.getValue(String.class);
            String time = temp.substring(1, 6);
            String bag = temp.substring(0, 1);
            String key = dataSnapshot.getKey();
            String v1, v2, v3, v4;

            if (key.equals("22348")) {

                if (bag.equals("0")) {
                    bg.setImageResource(R.drawable.luggage_1);

                } else if (bag.equals("1")) {
                    bg.setImageResource(R.drawable.luggage_2);
                    v1=dataSnapshot.getValue(String.class);
                    time=v1.substring(1,6);
                    textView.setText("Today, " + time);
                    displaynotification("Your Bag was checked at BLR");
                } else if (bag.equals("2")) {
                    bg.setImageResource(R.drawable.luggage_3);
                    textView2.setText("Today, " + time);
                    displaynotification("Your bag is loaded to flight #6E 5078");
                } else if (bag.equals("3")) {
                    bg.setImageResource(R.drawable.luggage_4);
                    textView3.setText("Today, " + time);
                    displaynotification("Your Bag is unloaded from Flight #6E 5078");
                } else if (bag.equals("4")) {
                    bg.setImageResource(R.drawable.luggage_5);
                    textView4.setText("Today, " + time);
                    displaynotification("Collect your bag at Baggage Claim 6-Terminal 2");
                } else {
                    bg.setImageResource(R.drawable.luggage_1);
                }
            }
        }
        else
        {
            bg.setImageResource(R.drawable.luggage_1);
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    private void displaynotification(String gate) {
        NotificationCompat.Builder mbuilber = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark)
                .setContentTitle("LUGGAGE NOTIFICATION :)")
                .setContentText(gate)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat nmc = NotificationManagerCompat.from(this);
        nmc.notify(1, mbuilber.build());

    }

    @Override
    protected void onStart() {
        super.onStart();
        childref.addValueEventListener(this);
    }


}
