package com.bharath.materialdesign.maport;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentBook extends Fragment implements View.OnClickListener {

    Button btnbook;
    public FragmentBook() {
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
        View view =  inflater.inflate(R.layout.fragment_book, container, false);

        btnbook = view.findViewById(R.id.btn_book);
        btnbook.setOnClickListener(this);
        return view;


    }

    @Override
    public void onClick(View v) {

        btnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),TicketActivity.class);
                startActivity(intent);
            }
        });

    }
}
