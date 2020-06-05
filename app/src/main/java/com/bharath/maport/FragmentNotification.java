package com.bharath.maport;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentNotification extends Fragment implements View.OnClickListener {

    Button btnnavi;

    public FragmentNotification() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notification, container, false);
        btnnavi = view.findViewById(R.id.startnavigation);
        btnnavi.setOnClickListener(this);
        return  view;

    }

    @Override
    public void onClick(View v) {

        btnnavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.google.ar.sceneform.samples.hellosceneform");
                startActivity( launchIntent );
            }
        });
    }

}
