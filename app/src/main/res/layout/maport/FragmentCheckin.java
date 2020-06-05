package com.bharath.materialdesign.maport;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentCheckin extends Fragment implements View.OnClickListener{

    Button btn_checkin;
    public FragmentCheckin() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_checkin, container, false);

        btn_checkin = view.findViewById(R.id.btn_webcheckin);
        btn_checkin.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        btn_checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CheckinActivity.class);
                startActivity(intent);
            }
        });

    }
}
