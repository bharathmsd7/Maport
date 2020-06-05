package com.bharath.maport;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class FragmentAccount extends Fragment implements View.OnClickListener {

    Button btn_track , btn_gotofeedback;
    public FragmentAccount() {
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
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        btn_track = view.findViewById(R.id.track);
        btn_track.setOnClickListener(this);
        btn_gotofeedback = view.findViewById(R.id.btn_gotofeedback);
        btn_gotofeedback.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        btn_track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),luggage_1.class);
                startActivity(intent);
            }
        });

        btn_gotofeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),RatingActivity.class);
                startActivity(intent);
            }
        });

    }
}
